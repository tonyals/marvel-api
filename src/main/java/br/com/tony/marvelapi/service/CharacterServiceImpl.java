package br.com.tony.marvelapi.service;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.converters.CharacterConverter;
import br.com.tony.marvelapi.dto.converters.ComicConverter;
import br.com.tony.marvelapi.dto.converters.EventConverter;
import br.com.tony.marvelapi.dto.converters.SeriesConverter;
import br.com.tony.marvelapi.dto.response.CharacterResponse;
import br.com.tony.marvelapi.dto.response.ComicResponse;
import br.com.tony.marvelapi.dto.response.EventResponse;
import br.com.tony.marvelapi.dto.response.SeriesResponse;
import br.com.tony.marvelapi.exception.NotFoundException;
import br.com.tony.marvelapi.mocks.CharacterMock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Override
    public CharacterResponse saveCharacter(Character character) {
        return null;
    }

    @Override
    public Page<CharacterResponse> getAll(Pageable pageable) {
        return new PageImpl<>(CharacterMock.characters().stream().map(CharacterConverter::fromCharacterToCharacterResponse)
                .collect(Collectors.toList()), pageable, CharacterMock.characters().size());
    }

    @Override
    public CharacterResponse getById(Long id) {

        Predicate<Character> findById = c -> c.getId().compareTo(id) == 0;

        Character result = CharacterMock.characters().stream().filter(findById)
                .findFirst().orElseThrow(() -> new NotFoundException("Não encontrado"));

        return CharacterConverter.fromCharacterToCharacterResponse(result);
    }

    @Override
    public ComicResponse getComicByCharacterId(Long characterId) {
        Predicate<Character> findById = c -> c.getId().compareTo(characterId) == 0;
        Character result = CharacterMock.characters().stream().filter(findById)
                .findFirst().orElseThrow(() -> new NotFoundException("Não encontrado"));

        return ComicConverter.fromComicToComicResponse(result.getComic());
    }

    @Override
    public EventResponse getEventByCharacterId(Long characterId) {
        Predicate<Character> findById = c -> c.getId().compareTo(characterId) == 0;
        Character result = CharacterMock.characters().stream().filter(findById)
                .findFirst().orElseThrow(() -> new NotFoundException("Não encontrado"));

        return EventConverter.fromEventToEventResponse(result.getEvent());
    }

    @Override
    public SeriesResponse getSeriesByCharacterId(Long characterId) {
        Predicate<Character> findById = c -> c.getId().compareTo(characterId) == 0;
        Character result = CharacterMock.characters().stream().filter(findById)
                .findFirst().orElseThrow(() -> new NotFoundException("Não encontrado"));

        return SeriesConverter.fromSeriesToSeriesResponse(result.getSeries());
    }
}

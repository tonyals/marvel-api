package br.com.tony.marvelapi.service.impl;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.converters.*;
import br.com.tony.marvelapi.dto.response.*;
import br.com.tony.marvelapi.exception.NotFoundException;
import br.com.tony.marvelapi.mocks.CharacterMock;
import br.com.tony.marvelapi.service.CharacterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
public class CharacterServiceImpl implements CharacterService {

    private final String NOT_FOUND = "Character with id %d not found";

    @Override
    public List<CharacterResponse> getAll() {
        return CharacterConverter.fromCharacterToCharacterResponse(CharacterMock.characters());
    }

    @Override
    public CharacterResponse getById(Long id) {
        Character result = findByIdOrElseThrowsNotFoundException(id);
        return CharacterConverter.fromCharacterToCharacterResponse(result);
    }

    @Override
    public ComicResponse getComicByCharacterId(Long characterId) {
        Character result = findByIdOrElseThrowsNotFoundException(characterId);
        return ComicConverter.fromComicToComicResponse(result.getComic());
    }

    @Override
    public EventResponse getEventByCharacterId(Long characterId) {
        Character result = findByIdOrElseThrowsNotFoundException(characterId);
        return EventConverter.fromEventToEventResponse(result.getEvent());
    }

    @Override
    public SeriesResponse getSeriesByCharacterId(Long characterId) {
        Character result = findByIdOrElseThrowsNotFoundException(characterId);
        return SeriesConverter.fromSeriesToSeriesResponse(result.getSeries());
    }

    @Override
    public StoryResponse getStoryByCharacterId(Long characterId) {
        Character result = findByIdOrElseThrowsNotFoundException(characterId);
        return StoryConverter.fromStoryToStoryResponse(result.getStory());
    }

    private Character findByIdOrElseThrowsNotFoundException(Long id) {
        Predicate<Character> findById = c -> c.getId().compareTo(id) == 0;
        return CharacterMock.characters().stream().filter(findById)
                .findFirst().orElseThrow(() -> new NotFoundException(
                        String.format(NOT_FOUND, id)
                ));
    }
}

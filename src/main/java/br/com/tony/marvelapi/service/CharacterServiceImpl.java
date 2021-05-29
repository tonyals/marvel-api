package br.com.tony.marvelapi.service;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.converters.CharacterConverter;
import br.com.tony.marvelapi.dto.response.CharacterResponse;
import br.com.tony.marvelapi.repository.CharacterRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public CharacterResponse saveCharacter(Character character) {
        Character save = this.characterRepository.save(character);
        return CharacterConverter.fromCharacterToCharacterResponse(save);
    }

    @Override
    public List<CharacterResponse> getAll() {
        List<Character> characters = this.characterRepository.findAll();

        return characters.stream().map(CharacterConverter::fromCharacterToCharacterResponse)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public Page<CharacterResponse> getAll(Pageable pageable) {
        Page<Character> characters = this.characterRepository.findAll(pageable);
        return new PageImpl<>(characters.stream().map(CharacterConverter::fromCharacterToCharacterResponse)
                .collect(Collectors.toList()), pageable, characters.getTotalElements());
    }
}
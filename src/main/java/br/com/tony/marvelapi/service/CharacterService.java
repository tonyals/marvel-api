package br.com.tony.marvelapi.service;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.repository.CharacterRepository;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public Character saveCharacter(Character character) {
        return this.characterRepository.save(character);
    }
}

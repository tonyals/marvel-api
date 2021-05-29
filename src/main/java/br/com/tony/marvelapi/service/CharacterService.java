package br.com.tony.marvelapi.service;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.response.CharacterResponse;

public interface CharacterService {
    CharacterResponse saveCharacter(Character character);
}

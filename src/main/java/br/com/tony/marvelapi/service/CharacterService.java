package br.com.tony.marvelapi.service;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.response.CharacterResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CharacterService {
    CharacterResponse saveCharacter(Character character);
    Page<CharacterResponse> getAll(Pageable pageable);
    CharacterResponse getById(Long id);
}

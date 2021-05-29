package br.com.tony.marvelapi.service;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.response.CharacterResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CharacterService {
    CharacterResponse saveCharacter(Character character);
    List<CharacterResponse> getAll();
    Page<CharacterResponse> getAll(Pageable pageable);
}

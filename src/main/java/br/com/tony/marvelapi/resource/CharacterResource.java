package br.com.tony.marvelapi.resource;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.response.CharacterResponse;
import br.com.tony.marvelapi.resource.wrapper.CharacterDataContainer;
import br.com.tony.marvelapi.service.CharacterService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/public/characters")
public class CharacterResource {

    private final CharacterService characterService;

    public CharacterResource(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Character character) {
        return ResponseEntity.ok(this.characterService.saveCharacter(character));
    }

    @GetMapping
    public ResponseEntity<CharacterDataContainer<CharacterResponse>> getAll(Pageable pageable) {
        Page<CharacterResponse> charactersPages = this.characterService.getAll(pageable);
        var response = new CharacterDataContainer<>(
                pageable.getOffset(),
                pageable.getPageSize(),
                charactersPages.getTotalElements(),
                charactersPages.getNumberOfElements(),
                charactersPages.getContent());

        return ResponseEntity.ok(response);
    }
}

package br.com.tony.marvelapi.resource;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.service.CharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

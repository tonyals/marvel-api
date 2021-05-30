package br.com.tony.marvelapi.resource;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.response.CharacterResponse;
import br.com.tony.marvelapi.dto.response.ComicResponse;
import br.com.tony.marvelapi.dto.response.EventResponse;
import br.com.tony.marvelapi.dto.response.SeriesResponse;
import br.com.tony.marvelapi.resource.wrapper.CharacterDataContainer;
import br.com.tony.marvelapi.resource.wrapper.CharacterDataWrapper;
import br.com.tony.marvelapi.service.CharacterService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

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
    public ResponseEntity<CharacterDataWrapper<CharacterDataContainer<CharacterResponse>>> getAll(Pageable pageable) {
        Page<CharacterResponse> charactersPages = this.characterService.getAll(pageable);
        var characterDataContainer = new CharacterDataContainer<>(
                pageable.getOffset(),
                pageable.getPageSize(),
                charactersPages.getTotalElements(),
                charactersPages.getNumberOfElements(),
                charactersPages.getContent());

        var response = new CharacterDataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                characterDataContainer
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<CharacterDataWrapper<CharacterDataContainer<CharacterResponse>>> getById(
            @PathVariable Long characterId) {
        CharacterResponse characterResponse = this.characterService.getById(characterId);
        var characterDataContainer = new CharacterDataContainer<>(
                0,
                20,
                1,
                1,
                Collections.singletonList(characterResponse));

        var response = new CharacterDataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                characterDataContainer
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{characterId}/comics")
    public ResponseEntity<CharacterDataWrapper<CharacterDataContainer<ComicResponse>>> getComicByCharacterId(
            @PathVariable Long characterId) {
        ComicResponse comicResponse = this.characterService.getComicByCharacterId(characterId);
        var characterDataContainer = new CharacterDataContainer<>(
                0,
                20,
                1,
                1,
                Collections.singletonList(comicResponse));

        var response = new CharacterDataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                characterDataContainer
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{characterId}/events")
    public ResponseEntity<CharacterDataWrapper<CharacterDataContainer<EventResponse>>> getEventByCharacterId(
            @PathVariable Long characterId) {
        EventResponse eventResponse = this.characterService.getEventByCharacterId(characterId);
        var characterDataContainer = new CharacterDataContainer<>(
                0,
                20,
                1,
                1,
                Collections.singletonList(eventResponse));

        var response = new CharacterDataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                characterDataContainer
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{characterId}/series")
    public ResponseEntity<CharacterDataWrapper<CharacterDataContainer<SeriesResponse>>> getSeriesByCharacterId(
            @PathVariable Long characterId) {
        SeriesResponse seriesResponse = this.characterService.getSeriesByCharacterId(characterId);
        var characterDataContainer = new CharacterDataContainer<>(
                0,
                20,
                1,
                1,
                Collections.singletonList(seriesResponse));

        var response = new CharacterDataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                characterDataContainer
        );

        return ResponseEntity.ok(response);
    }
}

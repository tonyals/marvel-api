package br.com.tony.marvelapi.resource;

import br.com.tony.marvelapi.dto.response.*;
import br.com.tony.marvelapi.resource.wrapper.DataContainer;
import br.com.tony.marvelapi.resource.wrapper.DataWrapper;
import br.com.tony.marvelapi.service.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/public/characters")
public class CharacterResource {

    private final CharacterService characterService;

    public CharacterResource(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public ResponseEntity<DataWrapper<DataContainer<List<CharacterResponse>>>> getAll() {
        List<CharacterResponse> charactersResponse = this.characterService.getAll();

        var response = new DataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                dataContainer(charactersResponse)
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<DataWrapper<DataContainer<CharacterResponse>>> getById(
            @PathVariable Long characterId) {

        CharacterResponse characterResponse = this.characterService.getById(characterId);

        var response = new DataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                dataContainer(characterResponse));

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{characterId}/comics")
    public ResponseEntity<DataWrapper<DataContainer<ComicResponse>>> getComicByCharacterId(
            @PathVariable Long characterId) {

        ComicResponse comicResponse = this.characterService.getComicByCharacterId(characterId);

        var response = new DataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                dataContainer(comicResponse)
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{characterId}/events")
    public ResponseEntity<DataWrapper<DataContainer<EventResponse>>> getEventByCharacterId(
            @PathVariable Long characterId) {

        EventResponse eventResponse = this.characterService.getEventByCharacterId(characterId);

        var response = new DataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                dataContainer(eventResponse)
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{characterId}/series")
    public ResponseEntity<DataWrapper<DataContainer<SeriesResponse>>> getSeriesByCharacterId(
            @PathVariable Long characterId) {
        SeriesResponse seriesResponse = this.characterService.getSeriesByCharacterId(characterId);

        var response = new DataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                dataContainer(seriesResponse)
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{characterId}/stories")
    public ResponseEntity<DataWrapper<DataContainer<StoryResponse>>> getStoryByCharacterId(
            @PathVariable Long characterId) {

        StoryResponse storyResponse = this.characterService.getStoryByCharacterId(characterId);

        var response = new DataWrapper<>(
                HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                dataContainer(storyResponse)
        );

        return ResponseEntity.ok(response);
    }

    private <T> DataContainer<T> dataContainer(T data) {
        return new DataContainer<>(
                0,
                20,
                1,
                1,
                Collections.singletonList(data));
    }
}

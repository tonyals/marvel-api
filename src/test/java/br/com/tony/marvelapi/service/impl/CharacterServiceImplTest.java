package br.com.tony.marvelapi.service.impl;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.converters.*;
import br.com.tony.marvelapi.exception.NotFoundException;
import br.com.tony.marvelapi.mocks.CharacterMock;
import br.com.tony.marvelapi.service.CharacterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CharacterServiceImplTest {

    private final CharacterService characterService = new CharacterServiceImpl();

    @Test
    @DisplayName("garante que getAll retorna uma lista de CharacterResponse")
    void returnListCharacterResponseSuccessTest() {
        var getAllResponse = this.characterService.getAll();
        getAllResponse.forEach(Assertions::assertNotNull);
    }

    @Test
    @DisplayName("garante que getById retorna um CharacterResponse")
    void returnCharacterResponseByIdSuccessTest() {
        Character character = getByCharacterId(1L);

        var characterResponse = this.characterService.getById(1L);

        assertEquals(characterResponse,
                CharacterConverter.fromCharacterToCharacterResponse(character));
    }

    @Test
    @DisplayName("garante que getById lança um NotFoundException caso id Character não exista")
    void returnCharacterResponseByIdNotFoundTest() {
        assertThrows(NotFoundException.class, () -> this.characterService.getById(3L));
    }

    @Test
    @DisplayName("garante que getComicByCharacterId retorna um ComicResponse")
    void returnComicResponseByCharacterIdByIdSuccessTest() {
        Character character = getByCharacterId(1L);

        var comicResponse = this.characterService.getComicByCharacterId(1L);

        assertEquals(comicResponse,
                ComicConverter.fromComicToComicResponse(character.getComic()));
    }

    @Test
    @DisplayName("garante que getComicByCharacterId lança um NotFoundException caso id Character não exista")
    void returnComicResponseByCharacterIdNotFoundTest() {
        assertThrows(NotFoundException.class, () -> this.characterService.getComicByCharacterId(3L));
    }

    @Test
    @DisplayName("garante que getEventByCharacterId retorna um ComicResponse")
    void returnEventResponseByCharacterIdByIdSuccessTest() {
        Character character = getByCharacterId(1L);

        var eventResponse = this.characterService.getEventByCharacterId(1L);

        assertEquals(eventResponse,
                EventConverter.fromEventToEventResponse(character.getEvent()));
    }

    @Test
    @DisplayName("garante que getEventByCharacterId lança um NotFoundException caso id Character não exista")
    void returnEventResponseByCharacterIdNotFoundTest() {
        assertThrows(NotFoundException.class, () -> this.characterService.getEventByCharacterId(3L));
    }

    @Test
    @DisplayName("garante que getSeriesByCharacterId retorna um ComicResponse")
    void returnSeriesResponseByCharacterIdByIdSuccessTest() {
        Character character = getByCharacterId(1L);

        var seriesResponse = this.characterService.getSeriesByCharacterId(1L);

        assertEquals(seriesResponse,
                SeriesConverter.fromSeriesToSeriesResponse(character.getSeries()));
    }

    @Test
    @DisplayName("garante que getSeriesByCharacterId lança um NotFoundException caso id Character não exista")
    void returnSeriesResponseByCharacterIdNotFoundTest() {
        assertThrows(NotFoundException.class, () -> this.characterService.getSeriesByCharacterId(3L));
    }

    @Test
    @DisplayName("garante que getStoryByCharacterId retorna um ComicResponse")
    void returnStoryResponseByCharacterIdByIdSuccessTest() {
        Character character = getByCharacterId(1L);

        var storyResponse = this.characterService.getStoryByCharacterId(1L);

        assertEquals(storyResponse,
                StoryConverter.fromStoryToStoryResponse(character.getStory()));
    }

    @Test
    @DisplayName("garante que getStoryByCharacterId lança um NotFoundException caso id Character não exista")
    void returnStoryResponseByCharacterIdNotFoundTest() {
        assertThrows(NotFoundException.class, () -> this.characterService.getStoryByCharacterId(3L));
    }

    private Character getByCharacterId(Long id) {

        Predicate<Character> findById = c -> c.getId().compareTo(id) == 0;

        return CharacterMock.characters().stream().filter(findById)
                .findFirst().orElseThrow();
    }
}

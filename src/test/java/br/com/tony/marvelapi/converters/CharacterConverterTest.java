package br.com.tony.marvelapi.converters;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.response.CharacterResponse;
import br.com.tony.marvelapi.mocks.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterConverterTest {

    @Test
    @DisplayName("garante que um CharacterResponse completo é retornado pelo converter")
    void returnCompleteCharacterResponseSuccessTest() {
        //  Given
        var characterStub = character();

        //  When
        var response = CharacterConverter
                .fromCharacterToCharacterResponse(characterStub);

        //  Then
        assertEquals(response, characterResponseStub());
    }

    private static CharacterResponse characterResponseStub() {
        var character = character();
        return CharacterResponse.builder()
                .id(character.getId())
                .name(character.getName())
                .description(character.getDescription())
                .resourceURI(character.getResourceURI())
                .imageResponse(ImageConverter.fromImageToImageResponse(character.getThumbnail()))
                .urlResponses(UrlConverter.fromUrlToUrlResponse(character.getUrls()))
                .comicList(ComicConverter.fromComicToComicList(character.getComic()))
                .storyList(StoryConverter.fromStoryToStoryList(character.getStory()))
                .eventList(EventConverter.fromEventToEventList(character.getEvent()))
                .seriesList(SeriesConverter.fromSeriesToSeriesList(character.getSeries()))
                .build();
    }

    private static Character character() {
        return Character.builder()
                .id(1L)
                .name("Hulk")
                .description("Any description")
                .resourceURI("http://resource-uri.com")
                .thumbnail(ImageMock.createImage())
                .urls(UrlMock.createUrls())
                .comic(ComicMock.createComic())
                .story(StoryMock.createStory())
                .event(EventMock.createEvent())
                .series(SeriesMock.createSeries())
                .build();
    }
}

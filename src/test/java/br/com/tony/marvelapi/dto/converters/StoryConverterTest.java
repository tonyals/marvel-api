package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Story;
import br.com.tony.marvelapi.dto.response.StoryResponse;
import br.com.tony.marvelapi.mocks.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoryConverterTest {

    @Test
    @DisplayName("garante que um StoryResponse completo é retornado pelo converter")
    void returnCompleteStoryResponseSuccessTest() {
        //  Given
        var seriesStub = createStory();

        //  When
        var response = StoryConverter
                .fromStoryToStoryResponse(seriesStub);

        //  Then
        assertEquals(response, storyResponseStub());
    }

    private static StoryResponse storyResponseStub() {
        var story = createStory();
        return StoryResponse.builder()
                .id(story.getId())
                .title(story.getTitle())
                .description(story.getDescription())
                .resourceURI(story.getResourceURI())
                .type(story.getType())
                .thumbnail(story.getThumbnail())
                .comicList(story.getComicList())
                .seriesList(story.getSeriesList())
                .eventList(story.getEventList())
                .characterList(story.getCharacterList())
                .creatorList(story.getCreatorList())
                .originalIssue(story.getOriginalIssue())
                .build();
    }

    private static Story createStory() {
        return Story.builder()
                .id(1L)
                .title("Story Tittle")
                .description("Description here")
                .resourceURI("Resource uri")
                .type("type here")
                .thumbnail(ImageMock.createImage())
                .comicList(ComicListMock.createComicList())
                .seriesList(SeriesListMock.createSeriesList())
                .eventList(EventListMock.createEventList())
                .characterList(CharacterListMock.createCharacterList())
                .creatorList(CreatorListMock.createCreatorList())
                .originalIssue(ComicSummaryMock.createComicSummary())
                .available(5)
                .returned(5)
                .collectionURI("collection uri")
                .items(Collections.singletonList(StorySummaryMock.createStorySummary()))
                .build();
    }
}

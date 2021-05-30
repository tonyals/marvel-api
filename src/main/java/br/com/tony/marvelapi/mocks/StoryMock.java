package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.Story;

import java.util.Collections;

public class StoryMock {
    public static Story createStory() {
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

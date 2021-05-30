package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.Event;

import java.util.Collections;

public class EventMock {

    public static Event createEvent() {
        return Event.builder()
                .id(1L)
                .title("Event tittle")
                .description("event description")
                .resourceURI("resource uri")
                .urls(UrlMock.createUrls())
                .thumbnail(ImageMock.createImage())
                .comicList(ComicListMock.createComicList())
                .storyList(StoryListMock.createStoryList())
                .seriesList(SeriesListMock.createSeriesList())
                .characterList(CharacterListMock.createCharacterList())
                .creatorList(CreatorListMock.createCreatorList())
                .next(EventSummaryMock.createEventSummary())
                .previous(EventSummaryMock.createEventSummary())
                .available(10)
                .returned(10)
                .collectionURI("Collection uri")
                .items(Collections.singletonList(EventSummaryMock.createEventSummary()))
                .build();
    }
}

package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.Series;

import java.util.Collections;

public class SeriesMock {

    public static Series createSeries() {
        return Series.builder()
                .id(1L)
                .title("Title here")
                .description("description here")
                .resourceURI("resource uri")
                .urls(UrlMock.createUrls())
                .startYear(2010)
                .endYear(2015)
                .rating("Five stars")
                .thumbnail(ImageMock.createImage())
                .comicLists(ComicListMock.createComicList())
                .storyLists(StoryListMock.createStoryList())
                .eventLists(EventListMock.createEventList())
                .characterList(CharacterListMock.createCharacterList())
                .creatorList(CreatorListMock.createCreatorList())
                .next(SeriesSummaryMock.createSeriesSummary())
                .previous(SeriesSummaryMock.createSeriesSummary())
                .available(10)
                .returned(10)
                .collectionURI("collection uri")
                .items(Collections.singletonList(SeriesSummaryMock.createSeriesSummary()))
                .build();
    }
}

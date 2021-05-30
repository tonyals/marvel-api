package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.*;

import java.util.Collections;

public class ComicMock {

    public static Comic createComic() {
        return Comic.builder()
                .id(1L)
                .digitalId(2L)
                .title("Comic Tittle")
                .issueNumber(25.0)
                .variantDescription("Variant description")
                .description("Description")
                .isbn("isbn here")
                .upc("upc here")
                .diamondCode("diamond code here")
                .ean("ean here")
                .issn("issn here")
                .format("format here")
                .pageCount(100)
                .textObjects(Collections.singletonList(TextObjectMock.createTextObject()))
                .resourceURI("resource uri here")
                .urls(UrlMock.createUrls())
                .series(SeriesSummaryMock.createSeriesSummary())
                .variants(Collections.singletonList(ComicSummaryMock.createComicSummary()))
                .collections(Collections.singletonList(ComicSummaryMock.createComicSummary()))
                .collectedIssues(Collections.singletonList(ComicSummaryMock.createComicSummary()))
                .dates(Collections.singletonList(ComicDateMock.createComicDate()))
                .prices(Collections.singletonList(ComicPriceMock.createComicPrice()))
                .thumbnail(ImageMock.createImage())
                .creators(CreatorListMock.createCreatorList())
                .characters(CharacterListMock.createCharacterList())
                .stories(StoryListMock.createStoryList())
                .events(EventListMock.createEventList())
                .available(10)
                .returned(10)
                .collectionURI("collection uri")
                .items(Collections.singletonList(ComicSummaryMock.createComicSummary()))
                .build();
    }
}

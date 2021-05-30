package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Comic;
import br.com.tony.marvelapi.dto.response.ComicResponse;
import br.com.tony.marvelapi.mocks.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComicConverterTest {

    @Test
    @DisplayName("garante que um ComicResponse completo é retornado pelo converter")
    void returnCompleteComicResponseSuccessTest() {
        //  Given
        var comicStub = createComic();

        //  When
        var response = ComicConverter
                .fromComicToComicResponse(comicStub);

        //  Then
        assertEquals(response, comicResponseStub());
    }

    private static ComicResponse comicResponseStub() {
        var comic = createComic();
        return ComicResponse.builder()
                .id(comic.getId())
                .digitalId(comic.getDigitalId())
                .title(comic.getTitle())
                .issueNumber(comic.getIssueNumber())
                .variantDescription(comic.getVariantDescription())
                .description(comic.getDescription())
                .isbn(comic.getIsbn())
                .upc(comic.getUpc())
                .diamondCode(comic.getDiamondCode())
                .ean(comic.getEan())
                .issn(comic.getIssn())
                .format(comic.getFormat())
                .pageCount(comic.getPageCount())
                .textObjects(comic.getTextObjects())
                .resourceURI(comic.getResourceURI())
                .urlResponses(UrlConverter.fromUrlToUrlResponse(comic.getUrls()))
                .series(comic.getSeries())
                .variants(comic.getVariants())
                .collections(comic.getCollections())
                .collectedIssues(comic.getCollectedIssues())
                .dates(comic.getDates())
                .prices(comic.getPrices())
                .imageResponse(ImageConverter.fromImageToImageResponse(comic.getThumbnail()))
                .creatorsList(comic.getCreators())
                .charactersList(comic.getCharacters())
                .storyList(comic.getStories())
                .eventList(comic.getEvents())
                .available(comic.getAvailable())
                .returned(comic.getReturned())
                .collectionURI(comic.getCollectionURI())
                .items(comic.getItems())
                .build();
    }

    private static Comic createComic() {
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

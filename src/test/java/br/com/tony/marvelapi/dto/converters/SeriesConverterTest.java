package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Series;
import br.com.tony.marvelapi.dto.response.SeriesResponse;
import br.com.tony.marvelapi.mocks.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeriesConverterTest {

    @Test
    @DisplayName("garante que um SeriesResponse completo é retornado pelo converter")
    void returnCompleteSeriesResponseSuccessTest() {
        //  Given
        var seriesStub = createSeries();

        //  When
        var response = SeriesConverter
                .fromSeriesToSeriesResponse(seriesStub);

        //  Then
        assertEquals(response, seriesResponseStub());
    }

    private static SeriesResponse seriesResponseStub() {
        var series = createSeries();
        return SeriesResponse.builder()
                .id(series.getId())
                .title(series.getTitle())
                .description(series.getDescription())
                .resourceURI(series.getResourceURI())
                .urls(series.getUrls())
                .startYear(series.getStartYear())
                .endYear(series.getEndYear())
                .rating(series.getRating())
                .thumbnail(series.getThumbnail())
                .comicLists(series.getComicLists())
                .storyLists(series.getStoryLists())
                .eventLists(series.getEventLists())
                .characterList(series.getCharacterList())
                .creatorList(series.getCreatorList())
                .next(series.getNext())
                .previous(series.getPrevious())
                .build();
    }

    private static Series createSeries() {
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

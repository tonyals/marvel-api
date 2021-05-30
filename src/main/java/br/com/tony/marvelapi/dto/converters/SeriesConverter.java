package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Series;
import br.com.tony.marvelapi.domain.SeriesList;
import br.com.tony.marvelapi.domain.SeriesSummary;
import br.com.tony.marvelapi.dto.response.SeriesResponse;
import br.com.tony.marvelapi.dto.response.SeriesSummaryResponse;

import java.util.ArrayList;
import java.util.List;

public class SeriesConverter {

    public static SeriesResponse fromSeriesToSeriesResponse(Series series) {
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

    public static SeriesList fromSeriesToSeriesList(Series series) {
        return SeriesList.builder()
                .available(series.getAvailable())
                .returned(series.getReturned())
                .collectionURI(series.getCollectionURI())
                .items(series.getItems())
                .build();
    }

    private static List<SeriesSummaryResponse> fromSeriesSummaryToSeriesSummaryResponse(List<SeriesSummary> seriesSummaries) {
        List<SeriesSummaryResponse> seriesSummaryResponses = new ArrayList<>();

        seriesSummaries.forEach(seriesSummary -> seriesSummaryResponses.add(
                new SeriesSummaryResponse(seriesSummary.getResourceURI(), seriesSummary.getName())
        ));

        return seriesSummaryResponses;
    }
}

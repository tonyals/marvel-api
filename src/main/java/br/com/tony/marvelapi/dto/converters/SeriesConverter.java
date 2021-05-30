package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Series;
import br.com.tony.marvelapi.domain.SeriesSummary;
import br.com.tony.marvelapi.dto.response.SeriesList;
import br.com.tony.marvelapi.dto.response.SeriesSummaryResponse;

import java.util.ArrayList;
import java.util.List;

public final class SeriesConverter {
    public static SeriesList fromSeriesToSeriesResponse(Series series) {
        return new SeriesList(
                series.getItems().size(),
                series.getItems().size(),
                series.getCollectionURI(),
                fromSeriesSummaryToSeriesSummaryResponse(series.getItems())
        );
    }

    private static List<SeriesSummaryResponse> fromSeriesSummaryToSeriesSummaryResponse(List<SeriesSummary> seriesSummaries) {
        List<SeriesSummaryResponse> seriesSummaryResponses = new ArrayList<>();

        seriesSummaries.forEach(seriesSummary -> seriesSummaryResponses.add(
                new SeriesSummaryResponse(seriesSummary.getResourceURI(), seriesSummary.getName())
        ));

        return seriesSummaryResponses;
    }
}

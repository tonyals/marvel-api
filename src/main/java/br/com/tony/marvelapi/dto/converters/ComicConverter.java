package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Comic;
import br.com.tony.marvelapi.domain.ComicSummary;
import br.com.tony.marvelapi.dto.response.ComicResponse;
import br.com.tony.marvelapi.dto.response.ComicSummaryResponse;

import java.util.ArrayList;
import java.util.List;

public final class ComicConverter {
    public static ComicResponse fromComicToComicResponse(Comic comic) {
        return new ComicResponse(
                comic.getAvailable(), comic.getReturned(), comic.getCollectionURI(),
                fromComicSummaryToComicSummaryResponse(comic.getItems())
        );
    }

    private static List<ComicSummaryResponse> fromComicSummaryToComicSummaryResponse(List<ComicSummary> comicSummaries) {
        List<ComicSummaryResponse> comicSummaryResponses = new ArrayList<>();

        comicSummaries.forEach(comicSummary -> comicSummaryResponses.add(
                new ComicSummaryResponse(comicSummary.getResourceURI(), comicSummary.getName())
        ));

        return comicSummaryResponses;
    }
}

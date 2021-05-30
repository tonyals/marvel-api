package br.com.tony.marvelapi.dto.response;

import java.util.List;

public final class SeriesResponse {
    private final Integer available;
    private final String collectionURI;
    private final List<SeriesSummaryResponse> items;
    private final Integer returned;

    public SeriesResponse(Integer available, Integer returned, String collectionURI, List<SeriesSummaryResponse> items) {
        this.available = available;
        this.returned = returned;
        this.collectionURI = collectionURI;
        this.items = items;
    }

    public Integer getAvailable() {
        return available;
    }

    public Integer getReturned() {
        return returned;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public List<SeriesSummaryResponse> getItems() {
        return items;
    }
}

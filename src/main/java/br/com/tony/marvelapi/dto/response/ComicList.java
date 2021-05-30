package br.com.tony.marvelapi.dto.response;

import java.util.List;

public final class ComicList {
    private final Integer available;
    private final String collectionURI;
    private final List<ComicSummaryResponse> items;
    private final Integer returned;

    public ComicList(Integer available, Integer returned, String collectionURI, List<ComicSummaryResponse> items) {
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

    public List<ComicSummaryResponse> getItems() {
        return items;
    }
}

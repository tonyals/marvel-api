package br.com.tony.marvelapi.dto.response;

import java.util.List;

public final class StoryList {
    private final Integer available;
    private final String collectionURI;
    private final List<StorySummaryResponse> items;
    private final Integer returned;

    public StoryList(Integer available, Integer returned, String collectionURI, List<StorySummaryResponse> items) {
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

    public List<StorySummaryResponse> getItems() {
        return items;
    }
}

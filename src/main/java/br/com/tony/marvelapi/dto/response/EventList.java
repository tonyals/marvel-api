package br.com.tony.marvelapi.dto.response;

import java.util.List;

public final class EventList {
    private final Integer available;
    private final String collectionURI;
    private final List<EventSummaryResponse> items;
    private final Integer returned;

    public EventList(Integer available, Integer returned, String collectionURI, List<EventSummaryResponse> items) {
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

    public List<EventSummaryResponse> getItems() {
        return items;
    }
}

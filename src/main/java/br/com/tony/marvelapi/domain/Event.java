package br.com.tony.marvelapi.domain;

import lombok.Builder;

import java.util.List;

@Builder
public class Event {
    private Long id;
    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<EventSummary> items;

    public Long getId() {
        return id;
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

    public List<EventSummary> getItems() {
        return items;
    }
}

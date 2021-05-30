package br.com.tony.marvelapi.domain;

import lombok.Builder;

import java.util.List;

@Builder
public class Comic {
    private final Long id;
    private final Integer available;
    private final Integer returned;
    private final String collectionURI;
    private final List<ComicSummary> items;

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

    public List<ComicSummary> getItems() {
        return items;
    }
}

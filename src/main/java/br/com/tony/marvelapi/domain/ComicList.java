package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Builder
@Getter
public class ComicList {
    private final Integer available;
    private final String collectionURI;
    private final List<ComicSummary> items;
    private final Integer returned;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComicList comicList = (ComicList) o;
        return Objects.equals(available, comicList.available) && Objects.equals(collectionURI, comicList.collectionURI) && Objects.equals(items, comicList.items) && Objects.equals(returned, comicList.returned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(available, collectionURI, items, returned);
    }
}

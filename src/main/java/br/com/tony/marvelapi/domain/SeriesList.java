package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Builder
@Getter
public class SeriesList {
    private final Integer available;
    private final String collectionURI;
    private final List<SeriesSummary> items;
    private final Integer returned;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeriesList that = (SeriesList) o;
        return Objects.equals(available, that.available) && Objects.equals(collectionURI, that.collectionURI) && Objects.equals(items, that.items) && Objects.equals(returned, that.returned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(available, collectionURI, items, returned);
    }
}

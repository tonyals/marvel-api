package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Builder
@Getter
public class CharacterList {
    private final Integer available;
    private final Integer returned;
    private final String collectionURI;
    private final List<CharacterSummary> items;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterList that = (CharacterList) o;
        return Objects.equals(available, that.available) && Objects.equals(returned, that.returned) && Objects.equals(collectionURI, that.collectionURI) && Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(available, returned, collectionURI, items);
    }
}

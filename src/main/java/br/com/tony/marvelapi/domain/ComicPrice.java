package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Builder
@Getter
public class ComicPrice {
    private final String type;
    private final float price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComicPrice that = (ComicPrice) o;
        return Float.compare(that.price, price) == 0 && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }
}

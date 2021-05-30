package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Objects;

@Builder
@Getter
public class ComicDate {
    private final String type;
    private final LocalDateTime date = LocalDateTime.now();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComicDate comicDate = (ComicDate) o;
        return Objects.equals(type, comicDate.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}

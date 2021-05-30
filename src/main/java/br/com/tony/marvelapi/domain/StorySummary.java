package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Builder
@Getter
public class StorySummary {
    private final Long id;
    private final String resourceURI;
    private final String name;
    private final String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StorySummary that = (StorySummary) o;
        return Objects.equals(id, that.id) && Objects.equals(resourceURI, that.resourceURI) && Objects.equals(name, that.name) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourceURI, name, type);
    }
}

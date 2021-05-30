package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Builder
@Getter
public class CreatorSummary {
    private final String resourceURI;
    private final String name;
    private final String role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatorSummary that = (CreatorSummary) o;
        return Objects.equals(resourceURI, that.resourceURI) && Objects.equals(name, that.name) && Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceURI, name, role);
    }
}

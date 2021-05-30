package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Builder
@Getter
public class Character {
    private final Long id;
    private final String name;
    private final String description;
    private final LocalDateTime modified = LocalDateTime.now();
    private final String resourceURI;
    private final Image thumbnail;
    private final List<Url> urls;
    private final Comic comic;
    private final Story story;
    private final Event event;
    private final Series series;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(id, character.id) && Objects.equals(name, character.name) && Objects.equals(description, character.description) && Objects.equals(resourceURI, character.resourceURI) && Objects.equals(thumbnail, character.thumbnail) && Objects.equals(urls, character.urls) && Objects.equals(comic, character.comic) && Objects.equals(story, character.story) && Objects.equals(event, character.event) && Objects.equals(series, character.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, resourceURI, thumbnail, urls, comic, story, event, series);
    }
}

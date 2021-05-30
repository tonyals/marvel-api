package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Builder
@Getter
public class Story {
    private final Long id;
    private final String title;
    private final String description;
    private final String resourceURI;
    private final String type;
    private final LocalDateTime modified = LocalDateTime.now();
    private final Image thumbnail;
    private final ComicList comicList;
    private final SeriesList seriesList;
    private final EventList eventList;
    private final CharacterList characterList;
    private final CreatorList creatorList;
    private final ComicSummary originalIssue;
    private final Integer available;
    private final Integer returned;
    private final String collectionURI;
    private final List<StorySummary> items;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Story story = (Story) o;
        return Objects.equals(id, story.id) && Objects.equals(title, story.title) && Objects.equals(description, story.description) && Objects.equals(resourceURI, story.resourceURI) && Objects.equals(type, story.type) && Objects.equals(thumbnail, story.thumbnail) && Objects.equals(comicList, story.comicList) && Objects.equals(seriesList, story.seriesList) && Objects.equals(eventList, story.eventList) && Objects.equals(characterList, story.characterList) && Objects.equals(creatorList, story.creatorList) && Objects.equals(originalIssue, story.originalIssue) && Objects.equals(available, story.available) && Objects.equals(returned, story.returned) && Objects.equals(collectionURI, story.collectionURI) && Objects.equals(items, story.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, resourceURI, type, thumbnail, comicList, seriesList, eventList, characterList, creatorList, originalIssue, available, returned, collectionURI, items);
    }
}

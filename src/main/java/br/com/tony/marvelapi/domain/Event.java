package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Builder
@Getter
public class Event {
    private final Long id;
    private final String title;
    private final String description;
    private final String resourceURI;
    private final List<Url> urls;
    private final LocalDateTime modified = LocalDateTime.now();
    private final LocalDate start = LocalDate.now();
    private final LocalDate end = LocalDate.now().plusDays(3L);
    private final Image thumbnail;
    private final ComicList comicList;
    private final StoryList storyList;
    private final SeriesList seriesList;
    private final CharacterList characterList;
    private final CreatorList creatorList;
    private final EventSummary next;
    private final EventSummary previous;
    private final Integer available;
    private final Integer returned;
    private final String collectionURI;
    private final List<EventSummary> items;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(id, event.id) && Objects.equals(title, event.title) && Objects.equals(description, event.description) && Objects.equals(resourceURI, event.resourceURI) && Objects.equals(urls, event.urls) && Objects.equals(thumbnail, event.thumbnail) && Objects.equals(comicList, event.comicList) && Objects.equals(storyList, event.storyList) && Objects.equals(seriesList, event.seriesList) && Objects.equals(characterList, event.characterList) && Objects.equals(creatorList, event.creatorList) && Objects.equals(next, event.next) && Objects.equals(previous, event.previous) && Objects.equals(available, event.available) && Objects.equals(returned, event.returned) && Objects.equals(collectionURI, event.collectionURI) && Objects.equals(items, event.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, resourceURI, urls, thumbnail, comicList, storyList, seriesList, characterList, creatorList, next, previous, available, returned, collectionURI, items);
    }
}

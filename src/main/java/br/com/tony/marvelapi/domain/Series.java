package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Builder
@Getter
public class Series {
    private final Long id;
    private final String title;
    private final String description;
    private final String resourceURI;
    private final List<Url> urls;
    private final Integer startYear;
    private final Integer endYear;
    private final String rating;
    private final LocalDateTime modified = LocalDateTime.now();
    private final Image thumbnail;
    private final ComicList comicLists;
    private final StoryList storyLists;
    private final EventList eventLists;
    private final CharacterList characterList;
    private final CreatorList creatorList;
    private final SeriesSummary next;
    private final SeriesSummary previous;
    private final Integer available;
    private final Integer returned;
    private final String collectionURI;
    private final List<SeriesSummary> items;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(id, series.id) && Objects.equals(title, series.title) && Objects.equals(description, series.description) && Objects.equals(resourceURI, series.resourceURI) && Objects.equals(urls, series.urls) && Objects.equals(startYear, series.startYear) && Objects.equals(endYear, series.endYear) && Objects.equals(rating, series.rating) && Objects.equals(modified, series.modified) && Objects.equals(thumbnail, series.thumbnail) && Objects.equals(comicLists, series.comicLists) && Objects.equals(storyLists, series.storyLists) && Objects.equals(eventLists, series.eventLists) && Objects.equals(characterList, series.characterList) && Objects.equals(creatorList, series.creatorList) && Objects.equals(next, series.next) && Objects.equals(previous, series.previous) && Objects.equals(available, series.available) && Objects.equals(returned, series.returned) && Objects.equals(collectionURI, series.collectionURI) && Objects.equals(items, series.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, resourceURI, urls, startYear, endYear, rating, modified, thumbnail, comicLists, storyLists, eventLists, characterList, creatorList, next, previous, available, returned, collectionURI, items);
    }
}

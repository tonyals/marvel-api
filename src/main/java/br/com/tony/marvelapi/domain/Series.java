package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

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
}

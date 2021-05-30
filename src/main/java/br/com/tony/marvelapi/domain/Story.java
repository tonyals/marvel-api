package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

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
}

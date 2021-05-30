package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
public class Comic {
    private final Long id;
    private final Long digitalId;
    private final String title;
    private final Double issueNumber;
    private final String variantDescription;
    private final String description;
    private final LocalDateTime modified = LocalDateTime.now();
    private final String isbn;
    private final String upc;
    private final String diamondCode;
    private final String ean;
    private final String issn;
    private final String format;
    private final Integer pageCount;
    private final List<TextObject> textObjects;
    private final String resourceURI;
    private final List<Url> urls;
    private final SeriesSummary series;
    private final List<ComicSummary> variants;
    private final List<ComicSummary> collections;
    private final List<ComicSummary> collectedIssues;
    private final List<ComicDate> dates;
    private final List<ComicPrice> prices;
    private final Image thumbnail;
    private final CreatorList creators;
    private final CharacterList characters;
    private final StoryList stories;
    private final EventList events;
    private final Integer available;
    private final Integer returned;
    private final String collectionURI;
    private final List<ComicSummary> items;
}

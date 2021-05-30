package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comic comic = (Comic) o;
        return Objects.equals(id, comic.id) && Objects.equals(digitalId, comic.digitalId) && Objects.equals(title, comic.title) && Objects.equals(issueNumber, comic.issueNumber) && Objects.equals(variantDescription, comic.variantDescription) && Objects.equals(description, comic.description) && Objects.equals(isbn, comic.isbn) && Objects.equals(upc, comic.upc) && Objects.equals(diamondCode, comic.diamondCode) && Objects.equals(ean, comic.ean) && Objects.equals(issn, comic.issn) && Objects.equals(format, comic.format) && Objects.equals(pageCount, comic.pageCount) && Objects.equals(textObjects, comic.textObjects) && Objects.equals(resourceURI, comic.resourceURI) && Objects.equals(urls, comic.urls) && Objects.equals(series, comic.series) && Objects.equals(variants, comic.variants) && Objects.equals(collections, comic.collections) && Objects.equals(collectedIssues, comic.collectedIssues) && Objects.equals(dates, comic.dates) && Objects.equals(prices, comic.prices) && Objects.equals(thumbnail, comic.thumbnail) && Objects.equals(creators, comic.creators) && Objects.equals(characters, comic.characters) && Objects.equals(stories, comic.stories) && Objects.equals(events, comic.events) && Objects.equals(available, comic.available) && Objects.equals(returned, comic.returned) && Objects.equals(collectionURI, comic.collectionURI) && Objects.equals(items, comic.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, digitalId, title, issueNumber, variantDescription, description, isbn, upc, diamondCode, ean, issn, format, pageCount, textObjects, resourceURI, urls, series, variants, collections, collectedIssues, dates, prices, thumbnail, creators, characters, stories, events, available, returned, collectionURI, items);
    }
}

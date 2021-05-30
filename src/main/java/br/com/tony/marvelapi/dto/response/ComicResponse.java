package br.com.tony.marvelapi.dto.response;

import br.com.tony.marvelapi.domain.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Builder
@Getter
public final class ComicResponse {
    @JsonProperty(value = "id")
    private final Long id;

    @JsonProperty(value = "digitalId")
    private final Long digitalId;

    @JsonProperty(value = "title")
    private final String title;

    @JsonProperty(value = "issueNumber")
    private final Double issueNumber;

    @JsonProperty(value = "variantDescription")
    private final String variantDescription;

    @JsonProperty(value = "description")
    private final String description;

    @JsonProperty(value = "modified")
    private final LocalDateTime modified = LocalDateTime.now();

    @JsonProperty(value = "isbn")
    private final String isbn;

    @JsonProperty(value = "upc")
    private final String upc;

    @JsonProperty(value = "diamondCode")
    private final String diamondCode;

    @JsonProperty(value = "ean")
    private final String ean;

    @JsonProperty(value = "issn")
    private final String issn;

    @JsonProperty(value = "format")
    private final String format;

    @JsonProperty(value = "pageCount")
    private final Integer pageCount;

    @JsonProperty(value = "textObjects")
    private final List<TextObject> textObjects;

    @JsonProperty(value = "resourceURI")
    private final String resourceURI;

    @JsonProperty(value = "urls")
    private final List<UrlResponse> urlResponses;

    @JsonProperty(value = "series")
    private final SeriesSummary series;

    @JsonProperty(value = "variants")
    private final List<ComicSummary> variants;

    @JsonProperty(value = "collections")
    private final List<ComicSummary> collections;

    @JsonProperty(value = "collectedIssues")
    private final List<ComicSummary> collectedIssues;

    @JsonProperty(value = "dates")
    private final List<ComicDate> dates;

    @JsonProperty(value = "prices")
    private final List<ComicPrice> prices;

    @JsonProperty(value = "thumbnail")
    private final ImageResponse imageResponse;

    @JsonProperty(value = "creators")
    private final CreatorList creatorsList;

    @JsonProperty(value = "characters")
    private final CharacterList charactersList;

    @JsonProperty(value = "stories")
    private final StoryList storyList;

    @JsonProperty(value = "events")
    private final EventList eventList;

    @JsonProperty(value = "available")
    private final Integer available;

    @JsonProperty(value = "returned")
    private final Integer returned;

    @JsonProperty(value = "collectionURI")
    private final String collectionURI;

    @JsonProperty(value = "items")
    private final List<ComicSummary> items;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComicResponse that = (ComicResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(digitalId, that.digitalId) && Objects.equals(title, that.title) && Objects.equals(issueNumber, that.issueNumber) && Objects.equals(variantDescription, that.variantDescription) && Objects.equals(description, that.description) && Objects.equals(isbn, that.isbn) && Objects.equals(upc, that.upc) && Objects.equals(diamondCode, that.diamondCode) && Objects.equals(ean, that.ean) && Objects.equals(issn, that.issn) && Objects.equals(format, that.format) && Objects.equals(pageCount, that.pageCount) && Objects.equals(textObjects, that.textObjects) && Objects.equals(resourceURI, that.resourceURI) && Objects.equals(urlResponses, that.urlResponses) && Objects.equals(series, that.series) && Objects.equals(variants, that.variants) && Objects.equals(collections, that.collections) && Objects.equals(collectedIssues, that.collectedIssues) && Objects.equals(dates, that.dates) && Objects.equals(prices, that.prices) && Objects.equals(imageResponse, that.imageResponse) && Objects.equals(creatorsList, that.creatorsList) && Objects.equals(charactersList, that.charactersList) && Objects.equals(storyList, that.storyList) && Objects.equals(eventList, that.eventList) && Objects.equals(available, that.available) && Objects.equals(returned, that.returned) && Objects.equals(collectionURI, that.collectionURI) && Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, digitalId, title, issueNumber, variantDescription, description, isbn, upc, diamondCode, ean, issn, format, pageCount, textObjects, resourceURI, urlResponses, series, variants, collections, collectedIssues, dates, prices, imageResponse, creatorsList, charactersList, storyList, eventList, available, returned, collectionURI, items);
    }
}

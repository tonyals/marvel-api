package br.com.tony.marvelapi.dto.response;

import br.com.tony.marvelapi.domain.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

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
}

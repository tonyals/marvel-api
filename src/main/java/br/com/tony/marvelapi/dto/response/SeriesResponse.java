package br.com.tony.marvelapi.dto.response;

import br.com.tony.marvelapi.domain.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
public final class SeriesResponse {
    @JsonProperty(value = "id")
    private final Long id;

    @JsonProperty(value = "title")
    private final String title;

    @JsonProperty(value = "description")
    private final String description;

    @JsonProperty(value = "resourceURI")
    private final String resourceURI;

    @JsonProperty(value = "urls")
    private final List<Url> urls;

    @JsonProperty(value = "startYear")
    private final Integer startYear;

    @JsonProperty(value = "endYear")
    private final Integer endYear;

    @JsonProperty(value = "rating")
    private final String rating;

    @JsonProperty(value = "modified")
    private final LocalDateTime modified = LocalDateTime.now();

    @JsonProperty(value = "thumbnail")
    private final Image thumbnail;

    @JsonProperty(value = "comics")
    private final ComicList comicLists;

    @JsonProperty(value = "stories")
    private final StoryList storyLists;

    @JsonProperty(value = "events")
    private final EventList eventLists;

    @JsonProperty(value = "characters")
    private final CharacterList characterList;

    @JsonProperty(value = "creators")
    private final CreatorList creatorList;

    @JsonProperty(value = "next")
    private final SeriesSummary next;

    @JsonProperty(value = "previous")
    private final SeriesSummary previous;
}

package br.com.tony.marvelapi.dto.response;

import br.com.tony.marvelapi.domain.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public final class StoryResponse {
    @JsonProperty(value = "id")
    private final Long id;

    @JsonProperty(value = "title")
    private final String title;

    @JsonProperty(value = "description")
    private final String description;

    @JsonProperty(value = "resourceURI")
    private final String resourceURI;

    @JsonProperty(value = "type")
    private final String type;

    @JsonProperty(value = "modified")
    private final LocalDateTime modified = LocalDateTime.now();

    @JsonProperty(value = "thumbnail")
    private final Image thumbnail;

    @JsonProperty(value = "comics")
    private final ComicList comicList;

    @JsonProperty(value = "series")
    private final SeriesList seriesList;

    @JsonProperty(value = "events")
    private final EventList eventList;

    @JsonProperty(value = "characters")
    private final CharacterList characterList;

    @JsonProperty(value = "creators")
    private final CreatorList creatorList;

    @JsonProperty(value = "originalissue")
    private final ComicSummary originalIssue;
}

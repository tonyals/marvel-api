package br.com.tony.marvelapi.dto.response;

import br.com.tony.marvelapi.domain.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
public class EventResponse {
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
    @JsonProperty(value = "modified")
    private final LocalDateTime modified = LocalDateTime.now();
    @JsonProperty(value = "start")
    private final LocalDate start = LocalDate.now();
    @JsonProperty(value = "end")
    private final LocalDate end = LocalDate.now().plusDays(3L);
    @JsonProperty(value = "thumbnail")
    private final Image thumbnail;
    @JsonProperty(value = "comics")
    private final ComicList comicList;
    @JsonProperty(value = "stories")
    private final StoryList storyList;
    @JsonProperty(value = "series")
    private final SeriesList seriesList;
    @JsonProperty(value = "characters")
    private final CharacterList characterList;
    @JsonProperty(value = "creators")
    private final CreatorList creatorList;
    @JsonProperty(value = "next")
    private final EventSummary next;
    @JsonProperty(value = "previous")
    private final EventSummary previous;
}

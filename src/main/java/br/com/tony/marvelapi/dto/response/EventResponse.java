package br.com.tony.marvelapi.dto.response;

import br.com.tony.marvelapi.domain.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Builder
@Getter
public final class EventResponse {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventResponse that = (EventResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(resourceURI, that.resourceURI) && Objects.equals(urls, that.urls) && Objects.equals(thumbnail, that.thumbnail) && Objects.equals(comicList, that.comicList) && Objects.equals(storyList, that.storyList) && Objects.equals(seriesList, that.seriesList) && Objects.equals(characterList, that.characterList) && Objects.equals(creatorList, that.creatorList) && Objects.equals(next, that.next) && Objects.equals(previous, that.previous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, resourceURI, urls, thumbnail, comicList, storyList, seriesList, characterList, creatorList, next, previous);
    }
}

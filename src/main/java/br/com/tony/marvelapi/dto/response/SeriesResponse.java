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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeriesResponse that = (SeriesResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(resourceURI, that.resourceURI) && Objects.equals(urls, that.urls) && Objects.equals(startYear, that.startYear) && Objects.equals(endYear, that.endYear) && Objects.equals(rating, that.rating) && Objects.equals(thumbnail, that.thumbnail) && Objects.equals(comicLists, that.comicLists) && Objects.equals(storyLists, that.storyLists) && Objects.equals(eventLists, that.eventLists) && Objects.equals(characterList, that.characterList) && Objects.equals(creatorList, that.creatorList) && Objects.equals(next, that.next) && Objects.equals(previous, that.previous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, resourceURI, urls, startYear, endYear, rating, thumbnail, comicLists, storyLists, eventLists, characterList, creatorList, next, previous);
    }
}

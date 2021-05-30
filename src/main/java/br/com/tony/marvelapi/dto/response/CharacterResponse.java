package br.com.tony.marvelapi.dto.response;

import br.com.tony.marvelapi.domain.ComicList;
import br.com.tony.marvelapi.domain.EventList;
import br.com.tony.marvelapi.domain.SeriesList;
import br.com.tony.marvelapi.domain.StoryList;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public final class CharacterResponse {
    @JsonProperty(value = "id")
    private final Long id;

    @JsonProperty(value = "name")
    private final String name;

    @JsonProperty(value = "description")
    private final String description;

    @JsonProperty(value = "modified")
    private final LocalDateTime modified = LocalDateTime.now();

    @JsonProperty(value = "thumbnail")
    private final ImageResponse imageResponse;

    @JsonProperty(value = "resourceURI")
    private final String resourceURI;

    @JsonProperty(value = "comics")
    private final ComicList comicList;

    @JsonProperty(value = "series")
    private final SeriesList seriesList;

    @JsonProperty(value = "stories")
    private final StoryList storyList;

    @JsonProperty(value = "events")
    private final EventList eventList;

    @JsonProperty(value = "urls")
    private final List<UrlResponse> urlResponses;

    private CharacterResponse(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.resourceURI = builder.resourceURI;
        this.imageResponse = builder.imageResponse;
        this.urlResponses = builder.urlResponses;
        this.comicList = builder.comicList;
        this.storyList = builder.storyList;
        this.eventList = builder.eventList;
        this.seriesList = builder.seriesList;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public ImageResponse getImageResponse() {
        return imageResponse;
    }

    public List<UrlResponse> getUrlResponses() {
        return urlResponses;
    }

    public ComicList getComicList() {
        return comicList;
    }

    public StoryList getStoryList() {
        return storyList;
    }

    public EventList getEventList() {
        return eventList;
    }

    public SeriesList getSeriesList() {
        return seriesList;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String description;
        private String resourceURI;
        private ImageResponse imageResponse;
        private List<UrlResponse> urlResponses;
        private ComicList comicList;
        private StoryList storyList;
        private EventList eventList;
        private SeriesList seriesList;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder resourceURI(String resourceURI) {
            this.resourceURI = resourceURI;
            return this;
        }

        public Builder imageResponse(ImageResponse imageResponse) {
            this.imageResponse = imageResponse;
            return this;
        }

        public Builder urlResponses(List<UrlResponse> urlResponses) {
            this.urlResponses = urlResponses;
            return this;
        }

        public Builder comicList(ComicList comicList) {
            this.comicList = comicList;
            return this;
        }

        public Builder storyList(StoryList storyList) {
            this.storyList = storyList;
            return this;
        }

        public Builder eventList(EventList eventList) {
            this.eventList = eventList;
            return this;
        }

        public Builder seriesList(SeriesList seriesList) {
            this.seriesList = seriesList;
            return this;
        }

        public CharacterResponse build() {
            return new CharacterResponse(this);
        }
    }
}

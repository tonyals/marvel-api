package br.com.tony.marvelapi.dto.response;

import java.time.LocalDateTime;
import java.util.List;

public final class CharacterResponse {
    private final Long id;
    private final String name;
    private final String description;
    private final LocalDateTime modified = LocalDateTime.now();
    private final String resourceURI;
    private final ImageResponse imageResponse;
    private final List<UrlResponse> urlResponses;
    private final ComicResponse comicResponse;
    private final StoryResponse storyResponse;
    private final EventResponse eventResponse;
    private final SeriesResponse seriesResponse;

    private CharacterResponse(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.resourceURI = builder.resourceURI;
        this.imageResponse = builder.imageResponse;
        this.urlResponses = builder.urlResponses;
        this.comicResponse = builder.comicResponse;
        this.storyResponse = builder.storyResponse;
        this.eventResponse = builder.eventResponse;
        this.seriesResponse = builder.seriesResponse;
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

    public ComicResponse getComicResponse() {
        return comicResponse;
    }

    public StoryResponse getStoryResponse() {
        return storyResponse;
    }

    public EventResponse getEventResponse() {
        return eventResponse;
    }

    public SeriesResponse getSeriesResponse() {
        return seriesResponse;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String description;
        private String resourceURI;
        private ImageResponse imageResponse;
        private List<UrlResponse> urlResponses;
        private ComicResponse comicResponse;
        private StoryResponse storyResponse;
        private EventResponse eventResponse;
        private SeriesResponse seriesResponse;

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

        public Builder comicResponse(ComicResponse comicResponse) {
            this.comicResponse = comicResponse;
            return this;
        }

        public Builder storyResponse(StoryResponse storyResponse) {
            this.storyResponse = storyResponse;
            return this;
        }

        public Builder eventResponse(EventResponse eventResponse) {
            this.eventResponse = eventResponse;
            return this;
        }

        public Builder seriesResponse(SeriesResponse seriesResponse) {
            this.seriesResponse = seriesResponse;
            return this;
        }

        public CharacterResponse build() {
            return new CharacterResponse(this);
        }
    }
}

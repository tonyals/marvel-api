package br.com.tony.marvelapi.domain;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public class Character {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime modified;
    private String resourceURI;
    private Image thumbnail;
    private List<Url> urls;
    private Comic comic;
    private Story story;
    private Event event;
    private Series series;

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

    public Image getThumbnail() {
        return thumbnail;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public Comic getComic() {
        return comic;
    }

    public Story getStory() {
        return story;
    }

    public Event getEvent() {
        return event;
    }

    public Series getSeries() {
        return series;
    }
}

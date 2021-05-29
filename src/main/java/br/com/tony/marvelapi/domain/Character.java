package br.com.tony.marvelapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDateTime modified;
    private String resourceURI;

    @OneToOne(cascade=CascadeType.PERSIST)
    private Image thumbnail;

    @OneToMany(cascade=CascadeType.PERSIST)
    @JsonProperty("urls")
    private List<Url> urls;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JsonProperty("comics")
    private Comic comic;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JsonProperty("stories")
    private Story story;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JsonProperty("events")
    private Event event;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JsonProperty("series")
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

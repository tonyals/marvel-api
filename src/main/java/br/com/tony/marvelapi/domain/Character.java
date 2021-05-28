package br.com.tony.marvelapi.domain;

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
    private String resourceUri;
    @OneToOne
    private Image thumbnail;
    @OneToMany
    private List<Url> urls;
    @OneToMany
    private List<Comic> comicList;
    @OneToMany
    private List<Story> storyList;
    @OneToMany
    private List<Event> eventList;
    @OneToMany
    private List<Series> seriesList;
}

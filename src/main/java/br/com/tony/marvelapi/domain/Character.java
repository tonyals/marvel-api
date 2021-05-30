package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
public class Character {
    private final Long id;
    private final String name;
    private final String description;
    private final LocalDateTime modified = LocalDateTime.now();
    private final String resourceURI;
    private final Image thumbnail;
    private final List<Url> urls;
    private final Comic comic;
    private final Story story;
    private final Event event;
    private final Series series;
}

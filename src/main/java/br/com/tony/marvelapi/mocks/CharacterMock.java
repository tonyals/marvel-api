package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.*;
import br.com.tony.marvelapi.domain.Character;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CharacterMock {

    public static Character character() {
        return Character.builder()
                        .id(1L)
                        .name("Hulk")
                        .description("Any description")
                        .modified(LocalDateTime.now())
                        .resourceURI("http://resource-uri.com")
                        .thumbnail(Image.builder()
                                .id(1L)
                                .path("image/path")
                                .extension("jpg")
                                .build())
                        .urls(Arrays.asList(
                                Url.builder()
                                        .id(1L)
                                        .url("url 1 here")
                                        .type("type url here")
                                        .build(),
                                Url.builder()
                                        .id(2L)
                                        .url("url 2 here")
                                        .type("type url here")
                                        .build()
                        ))
                        .comic(Comic.builder()
                                .id(1L)
                                .available(10)
                                .returned(10)
                                .collectionURI("collection uri")
                                .items(Collections.singletonList(
                                        ComicSummary.builder()
                                                .id(1L)
                                                .name("name comic")
                                                .resourceURI("resource uri")
                                                .build()
                                ))
                                .build())
                        .story(Story.builder()
                                .id(1L)
                                .available(5)
                                .returned(5)
                                .collectionURI("collection uri")
                                .items(Collections.singletonList(
                                        StorySummary.builder()
                                                .id(1L)
                                                .resourceURI("resource uri")
                                                .name("story name")
                                                .type("story type")
                                                .build()
                                ))
                                .build())
                        .event(Event.builder()
                                .id(1L)
                                .available(10)
                                .returned(10)
                                .collectionURI("Collection uri")
                                .items(Collections.singletonList(
                                        EventSummary.builder()
                                                .id(1L)
                                                .resourceURI("Resource uri")
                                                .name("Name event")
                                                .build()
                                ))
                                .build())
                        .series(Series.builder()
                                .id(1L)
                                .available(10)
                                .returned(10)
                                .collectionURI("collection uri")
                                .items(Collections.singletonList(
                                        SeriesSummary.builder()
                                                .id(1L)
                                                .resourceURI("resource uri")
                                                .name("serie name")
                                                .build()
                                ))
                                .build())
                        .build();
    }

    public static List<Character> characters() {
        return Arrays.asList(character(), character());
    }
}

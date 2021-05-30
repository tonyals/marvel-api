package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.Character;

import java.util.Arrays;
import java.util.List;

public class CharacterMock {

    public static Character character() {
        return Character.builder()
                        .id(1L)
                        .name("Hulk")
                        .description("Any description")
                        .resourceURI("http://resource-uri.com")
                        .thumbnail(ImageMock.createImage())
                        .urls(UrlMock.createUrls())
                        .comic(ComicMock.createComic())
                        .story(StoryMock.createStory())
                        .event(EventMock.createEvent())
                        .series(SeriesMock.createSeries())
                        .build();
    }

    public static List<Character> characters() {
        return Arrays.asList(character(), character());
    }
}

package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.Story;
import br.com.tony.marvelapi.domain.StorySummary;

import java.util.Collections;

public class StoryMock {
    public static Story createStory() {
        return Story.builder()
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
                .build();
    }
}

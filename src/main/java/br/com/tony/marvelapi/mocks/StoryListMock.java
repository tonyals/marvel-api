package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.StoryList;
import br.com.tony.marvelapi.domain.StorySummary;

import java.util.Collections;

public class StoryListMock {

    public static StoryList createStoryList() {
        return StoryList.builder()
                .available(10)
                .returned(10)
                .collectionURI("collection uri")
                .items(Collections.singletonList(
                        StorySummary.builder()
                                .id(1L)
                                .name("name here")
                                .type("type here")
                                .resourceURI("uri here")
                                .build()
                ))
                .build();
    }
}

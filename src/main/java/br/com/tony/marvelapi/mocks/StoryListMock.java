package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.StoryList;

import java.util.Collections;

public class StoryListMock {

    public static StoryList createStoryList() {
        return StoryList.builder()
                .available(10)
                .returned(10)
                .collectionURI("collection uri")
                .items(Collections.singletonList(StorySummaryMock.createStorySummary()))
                .build();
    }
}

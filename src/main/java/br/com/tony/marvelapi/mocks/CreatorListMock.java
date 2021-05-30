package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.CreatorList;

import java.util.Collections;

public class CreatorListMock {

    public static CreatorList createCreatorList() {
        return CreatorList.builder()
                .available(10)
                .returned(10)
                .collectionURI("collection uri")
                .items(Collections.singletonList(CreatorSummaryMock.createCreatorSummary()))
                .build();
    }
}

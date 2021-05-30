package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.CreatorList;
import br.com.tony.marvelapi.domain.CreatorSummary;

import java.util.Collections;

public class CreatorListMock {

    public static CreatorList createCreatorList() {
        return CreatorList.builder()
                .available(10)
                .returned(10)
                .collectionURI("collection uri")
                .items(Collections.singletonList(
                        CreatorSummary.builder()
                                .resourceURI("resource uri")
                                .name("name creator")
                                .role("creator role")
                                .build()
                ))
                .build();
    }
}

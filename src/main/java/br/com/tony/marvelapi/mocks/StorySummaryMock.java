package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.StorySummary;

public class StorySummaryMock {

    public static StorySummary createStorySummary() {
        return StorySummary.builder()
                .id(1L)
                .name("name here")
                .type("type here")
                .resourceURI("uri here")
                .build();
    }
}

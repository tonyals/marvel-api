package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.CreatorSummary;

public class CreatorSummaryMock {
    public static CreatorSummary createCreatorSummary() {
        return CreatorSummary.builder()
                .resourceURI("resource uri")
                .name("name creator")
                .role("creator role")
                .build();
    }
}

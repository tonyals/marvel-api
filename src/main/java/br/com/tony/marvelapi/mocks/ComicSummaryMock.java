package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.ComicSummary;

public class ComicSummaryMock {

    public static ComicSummary createComicSummary() {
        return ComicSummary.builder()
                .id(1L)
                .name("name comic")
                .resourceURI("resource uri")
                .build();
    }
}

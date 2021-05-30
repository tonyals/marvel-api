package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.SeriesSummary;

public class SeriesSummaryMock {

    public static SeriesSummary createSeriesSummary() {
        return SeriesSummary.builder()
                .id(1L)
                .resourceURI("resource uri")
                .name("serie name")
                .build();
    }
}

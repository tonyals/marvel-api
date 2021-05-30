package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.Series;
import br.com.tony.marvelapi.domain.SeriesSummary;

import java.util.Collections;

public class SeriesMock {

    public static Series createSeries() {
        return Series.builder()
                .id(1L)
                .available(10)
                .returned(10)
                .collectionURI("collection uri")
                .items(Collections.singletonList(
                        SeriesSummary.builder()
                                .id(1L)
                                .resourceURI("resource uri")
                                .name("serie name")
                                .build()
                ))
                .build();
    }
}

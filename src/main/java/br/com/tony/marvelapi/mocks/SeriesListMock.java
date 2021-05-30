package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.SeriesList;
import br.com.tony.marvelapi.domain.SeriesSummary;

import java.util.Collections;

public class SeriesListMock {

    public static SeriesList createSeriesList() {
        return SeriesList.builder()
                .returned(10)
                .available(10)
                .collectionURI("collection uri")
                .items(Collections.singletonList(SeriesSummary.builder()
                        .id(1L)
                        .name("name here")
                        .resourceURI("resource uri")
                        .build()))
                .build();
    }
}

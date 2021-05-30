package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.ComicList;

import java.util.Collections;

public class ComicListMock {

    public static ComicList createComicList() {
        return ComicList.builder()
                .returned(10)
                .available(10)
                .items(Collections.singletonList(ComicSummaryMock.createComicSummary()))
                .build();
    }
}

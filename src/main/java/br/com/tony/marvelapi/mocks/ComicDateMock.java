package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.ComicDate;

public class ComicDateMock {
    public static ComicDate createComicDate() {
        return ComicDate.builder()
                .type("Type here")
                .build();
    }
}

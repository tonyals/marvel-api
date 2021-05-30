package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.Url;

import java.util.Arrays;
import java.util.List;

public class UrlMock {

    public static List<Url> createUrls() {
        return Arrays.asList(
                Url.builder()
                        .id(1L)
                        .url("url 1 here")
                        .type("type url here")
                        .build(),
                Url.builder()
                        .id(2L)
                        .url("url 2 here")
                        .type("type url here")
                        .build()
        );
    }
}

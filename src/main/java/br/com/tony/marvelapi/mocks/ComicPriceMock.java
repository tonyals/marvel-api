package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.ComicPrice;

public class ComicPriceMock {
    public static ComicPrice createComicPrice() {
        return ComicPrice.builder()
                .price(19.90F)
                .type("type here")
                .build();
    }
}

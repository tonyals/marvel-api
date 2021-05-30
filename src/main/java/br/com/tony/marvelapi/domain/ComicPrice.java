package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ComicPrice {
    private final String type;
    private final float price;
}

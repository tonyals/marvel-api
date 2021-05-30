package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ComicList {
    private final Integer available;
    private final String collectionURI;
    private final List<ComicSummary> items;
    private final Integer returned;
}

package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public final class SeriesList {
    private final Integer available;
    private final String collectionURI;
    private final List<SeriesSummary> items;
    private final Integer returned;
}

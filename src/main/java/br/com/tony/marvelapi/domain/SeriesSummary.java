package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SeriesSummary {
    private final Long id;
    private final String resourceURI;
    private final String name;
}

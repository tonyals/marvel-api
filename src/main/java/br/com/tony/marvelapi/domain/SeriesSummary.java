package br.com.tony.marvelapi.domain;

import lombok.Builder;

@Builder
public class SeriesSummary {
    private Long id;
    private String resourceURI;
    private String name;

    public Long getId() {
        return id;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public String getName() {
        return name;
    }
}

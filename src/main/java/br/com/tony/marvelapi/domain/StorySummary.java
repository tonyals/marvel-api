package br.com.tony.marvelapi.domain;

import lombok.Builder;

@Builder
public class StorySummary {
    private Long id;
    private String resourceURI;
    private String name;
    private String type;

    public Long getId() {
        return id;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

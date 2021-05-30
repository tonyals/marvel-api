package br.com.tony.marvelapi.domain;

import lombok.Builder;

@Builder
public class Url {
    private Long id;
    private String type;
    private String url;

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}

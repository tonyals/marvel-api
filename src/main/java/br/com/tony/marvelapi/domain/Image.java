package br.com.tony.marvelapi.domain;

import lombok.Builder;

@Builder
public class Image {
    private Long id;
    private String path;
    private String extension;

    public Long getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }
}

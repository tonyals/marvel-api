package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ComicSummary {
    private Long id;
    private String resourceURI;
    private String name;
}

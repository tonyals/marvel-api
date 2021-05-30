package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Url {
    private final Long id;
    private final String type;
    private final String url;
}

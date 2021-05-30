package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TextObject {
    private final String type;
    private final String language;
    private final String text;
}

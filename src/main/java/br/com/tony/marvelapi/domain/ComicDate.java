package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class ComicDate {
    private final String type;
    private final LocalDateTime date = LocalDateTime.now();
}

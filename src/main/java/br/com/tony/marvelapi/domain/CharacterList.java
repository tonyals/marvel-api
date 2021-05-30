package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class CharacterList {
    private final Integer available;
    private final Integer returned;
    private final String collectionURI;
    private final List<CharacterSummary> items;
}
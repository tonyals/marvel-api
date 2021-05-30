package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class CreatorList {
    private final Integer available;
    private final Integer returned;
    private final String collectionURI;
    private final List<CreatorSummary> items;
}

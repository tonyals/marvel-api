package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class StoryList {
    private final Integer available;
    private final String collectionURI;
    private final List<StorySummary> items;
    private final Integer returned;
}

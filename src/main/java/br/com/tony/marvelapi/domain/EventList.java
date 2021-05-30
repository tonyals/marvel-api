package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public final class EventList {
    private final Integer available;
    private final String collectionURI;
    private final List<EventSummary> items;
    private final Integer returned;
}

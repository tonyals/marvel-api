package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.EventSummary;

public class EventSummaryMock {

    public static EventSummary createEventSummary() {
        return EventSummary.builder()
                .id(10L)
                .name("Event 1")
                .resourceURI("resource uri")
                .build();
    }
}

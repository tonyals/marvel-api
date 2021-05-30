package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.EventList;

import java.util.Collections;

public class EventListMock {

    public static EventList createEventList() {
        return EventList.builder()
                .collectionURI("collection uri")
                .available(10)
                .returned(10)
                .items(Collections.singletonList(EventSummaryMock.createEventSummary()))
                .build();
    }
}

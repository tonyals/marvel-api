package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.EventList;
import br.com.tony.marvelapi.domain.EventSummary;

import java.util.Collections;

public class EventListMock {

    public static EventList createEventList() {
        return EventList.builder()
                .collectionURI("collection uri")
                .available(10)
                .returned(10)
                .items(Collections.singletonList(
                        EventSummary.builder()
                                .id(1L)
                                .name("event name")
                                .resourceURI("resource uri")
                                .build()
                ))
                .build();
    }
}

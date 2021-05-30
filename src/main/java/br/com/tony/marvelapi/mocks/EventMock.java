package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.Event;
import br.com.tony.marvelapi.domain.EventSummary;

import java.util.Collections;

public class EventMock {

    public static Event createEvent() {
        return Event.builder()
                .id(1L)
                .available(10)
                .returned(10)
                .collectionURI("Collection uri")
                .items(Collections.singletonList(
                        EventSummary.builder()
                                .id(1L)
                                .resourceURI("Resource uri")
                                .name("Name event")
                                .build()
                ))
                .build();
    }
}

package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Event;
import br.com.tony.marvelapi.domain.EventSummary;
import br.com.tony.marvelapi.dto.response.EventList;
import br.com.tony.marvelapi.dto.response.EventSummaryResponse;

import java.util.ArrayList;
import java.util.List;

public final class EventConverter {
    public static EventList fromEventToEventResponse(Event event) {
        return new EventList(
                event.getItems().size(),
                event.getItems().size(),
                event.getCollectionURI(),
                fromEventSummaryToEventSummaryResponse(event.getItems())
        );
    }

    private static List<EventSummaryResponse> fromEventSummaryToEventSummaryResponse(List<EventSummary> eventSummaries) {
        List<EventSummaryResponse> eventSummaryResponses = new ArrayList<>();

        eventSummaries.forEach(eventSummary -> eventSummaryResponses.add(
                new EventSummaryResponse(eventSummary.getResourceURI(), eventSummary.getName())
        ));

        return eventSummaryResponses;
    }
}

package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Event;
import br.com.tony.marvelapi.domain.EventSummary;
import br.com.tony.marvelapi.dto.response.EventResponse;
import br.com.tony.marvelapi.dto.response.EventSummaryResponse;

import java.util.ArrayList;
import java.util.List;

public final class EventConverter {
    public static EventResponse fromEventToEventResponse(Event event) {
        return new EventResponse(event.getAvailable(), event.getReturned(),
                event.getCollectionURI(), fromEventSummaryToEventSummaryResponse(event.getItems()));
    }

    private static List<EventSummaryResponse> fromEventSummaryToEventSummaryResponse(List<EventSummary> eventSummaries) {
        List<EventSummaryResponse> eventSummaryResponses = new ArrayList<>();

        eventSummaries.forEach(eventSummary -> eventSummaryResponses.add(
                new EventSummaryResponse(eventSummary.getResourceURI(), eventSummary.getName())
        ));

        return eventSummaryResponses;
    }
}

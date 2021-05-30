package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Builder
@Getter
public class EventList {
    private final Integer available;
    private final String collectionURI;
    private final List<EventSummary> items;
    private final Integer returned;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventList eventList = (EventList) o;
        return Objects.equals(available, eventList.available) && Objects.equals(collectionURI, eventList.collectionURI) && Objects.equals(items, eventList.items) && Objects.equals(returned, eventList.returned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(available, collectionURI, items, returned);
    }
}

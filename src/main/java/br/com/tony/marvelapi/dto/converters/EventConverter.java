package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Event;
import br.com.tony.marvelapi.domain.EventList;
import br.com.tony.marvelapi.dto.response.EventResponse;

public class EventConverter {

    public static EventResponse fromEventToEventResponse(Event event) {
        return EventResponse.builder()
                .id(event.getId())
                .title(event.getTitle())
                .description(event.getDescription())
                .resourceURI(event.getResourceURI())
                .urls(event.getUrls())
                .thumbnail(event.getThumbnail())
                .comicList(event.getComicList())
                .storyList(event.getStoryList())
                .seriesList(event.getSeriesList())
                .characterList(event.getCharacterList())
                .creatorList(event.getCreatorList())
                .next(event.getNext())
                .previous(event.getPrevious())
                .build();
    }

    public static EventList fromEventToEventList(Event event) {
        return EventList.builder()
                .available(event.getAvailable())
                .returned(event.getReturned())
                .collectionURI(event.getCollectionURI())
                .items(event.getItems())
                .build();
    }
}

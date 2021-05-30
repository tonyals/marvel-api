package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Event;
import br.com.tony.marvelapi.dto.response.EventResponse;
import br.com.tony.marvelapi.mocks.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventConverterTest {

    @Test
    @DisplayName("garante que um EventResponse completo é retornado pelo converter")
    void returnCompleteEventResponseSuccessTest() {
        //  Given
        var eventStub = createEvent();

        //  When
        var response = EventConverter
                .fromEventToEventResponse(eventStub);

        //  Then
        assertEquals(response, eventResponseStub());
    }

    private static EventResponse eventResponseStub() {
        var event = createEvent();
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

    private static Event createEvent() {
        return Event.builder()
                .id(1L)
                .title("Event tittle")
                .description("event description")
                .resourceURI("resource uri")
                .urls(UrlMock.createUrls())
                .thumbnail(ImageMock.createImage())
                .comicList(ComicListMock.createComicList())
                .storyList(StoryListMock.createStoryList())
                .seriesList(SeriesListMock.createSeriesList())
                .characterList(CharacterListMock.createCharacterList())
                .creatorList(CreatorListMock.createCreatorList())
                .next(EventSummaryMock.createEventSummary())
                .previous(EventSummaryMock.createEventSummary())
                .available(10)
                .returned(10)
                .collectionURI("Collection uri")
                .items(Collections.singletonList(EventSummaryMock.createEventSummary()))
                .build();
    }
}

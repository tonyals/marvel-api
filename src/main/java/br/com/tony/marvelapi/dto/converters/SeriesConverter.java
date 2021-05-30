package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Series;
import br.com.tony.marvelapi.domain.SeriesList;
import br.com.tony.marvelapi.dto.response.SeriesResponse;

public class SeriesConverter {

    public static SeriesResponse fromSeriesToSeriesResponse(Series series) {
        return SeriesResponse.builder()
                .id(series.getId())
                .title(series.getTitle())
                .description(series.getDescription())
                .resourceURI(series.getResourceURI())
                .urls(series.getUrls())
                .startYear(series.getStartYear())
                .endYear(series.getEndYear())
                .rating(series.getRating())
                .thumbnail(series.getThumbnail())
                .comicLists(series.getComicLists())
                .storyLists(series.getStoryLists())
                .eventLists(series.getEventLists())
                .characterList(series.getCharacterList())
                .creatorList(series.getCreatorList())
                .next(series.getNext())
                .previous(series.getPrevious())
                .build();
    }

    public static SeriesList fromSeriesToSeriesList(Series series) {
        return SeriesList.builder()
                .available(series.getAvailable())
                .returned(series.getReturned())
                .collectionURI(series.getCollectionURI())
                .items(series.getItems())
                .build();
    }
}

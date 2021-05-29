package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.response.CharacterResponse;

public final class CharacterConverter {
    public static CharacterResponse fromCharacterToCharacterResponse(Character character) {
        return new CharacterResponse.Builder()
                .id(character.getId())
                .name(character.getName())
                .description(character.getDescription())
                .resourceURI(character.getResourceURI())
                .imageResponse(ImageConverter.fromImageToImageResponse(character.getThumbnail()))
                .urlResponses(UrlConverter.fromUrlToUrlResponse(character.getUrls()))
                .comicResponse(ComicConverter.fromComicToComicResponse(character.getComic()))
                .storyResponse(StoryConverter.fromStoryToStoryResponse(character.getStory()))
                .eventResponse(EventConverter.fromEventToEventResponse(character.getEvent()))
                .seriesResponse(SeriesConverter.fromSeriesToSeriesResponse(character.getSeries()))
                .build();
    }
}

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
                .comicList(ComicConverter.fromComicToComicList(character.getComic()))
                .storyList(StoryConverter.fromStoryToStoryResponse(character.getStory()))
                .eventList(EventConverter.fromEventToEventList(character.getEvent()))
                .seriesList(SeriesConverter.fromSeriesToSeriesList(character.getSeries()))
                .build();
    }
}

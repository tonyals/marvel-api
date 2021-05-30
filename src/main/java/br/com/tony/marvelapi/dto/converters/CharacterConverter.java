package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Character;
import br.com.tony.marvelapi.dto.response.CharacterResponse;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterConverter {
    public static CharacterResponse fromCharacterToCharacterResponse(Character character) {
        return CharacterResponse.builder()
                .id(character.getId())
                .name(character.getName())
                .description(character.getDescription())
                .resourceURI(character.getResourceURI())
                .imageResponse(ImageConverter.fromImageToImageResponse(character.getThumbnail()))
                .urlResponses(UrlConverter.fromUrlToUrlResponse(character.getUrls()))
                .comicList(ComicConverter.fromComicToComicList(character.getComic()))
                .storyList(StoryConverter.fromStoryToStoryList(character.getStory()))
                .eventList(EventConverter.fromEventToEventList(character.getEvent()))
                .seriesList(SeriesConverter.fromSeriesToSeriesList(character.getSeries()))
                .build();
    }

    public static List<CharacterResponse> fromCharacterToCharacterResponse(List<Character> characters) {
        return characters.stream()
                .map(CharacterConverter::fromCharacterToCharacterResponse)
                .collect(Collectors.toUnmodifiableList());
    }
}

package br.com.tony.marvelapi.converters;

import br.com.tony.marvelapi.domain.Story;
import br.com.tony.marvelapi.domain.StoryList;
import br.com.tony.marvelapi.dto.response.StoryResponse;

public class StoryConverter {

    public static StoryResponse fromStoryToStoryResponse(Story story) {
        return StoryResponse.builder()
                .id(story.getId())
                .title(story.getTitle())
                .description(story.getDescription())
                .resourceURI(story.getResourceURI())
                .type(story.getType())
                .thumbnail(story.getThumbnail())
                .comicList(story.getComicList())
                .seriesList(story.getSeriesList())
                .eventList(story.getEventList())
                .characterList(story.getCharacterList())
                .creatorList(story.getCreatorList())
                .originalIssue(story.getOriginalIssue())
                .build();
    }

    public static StoryList fromStoryToStoryList(Story story) {
        return StoryList.builder()
                .available(story.getAvailable())
                .returned(story.getReturned())
                .collectionURI(story.getCollectionURI())
                .items(story.getItems())
                .build();
    }
}

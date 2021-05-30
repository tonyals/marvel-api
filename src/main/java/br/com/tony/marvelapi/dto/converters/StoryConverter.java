package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Story;
import br.com.tony.marvelapi.domain.StoryList;
import br.com.tony.marvelapi.domain.StorySummary;
import br.com.tony.marvelapi.dto.response.StorySummaryResponse;

import java.util.ArrayList;
import java.util.List;

public final class StoryConverter {
    public static StoryList fromStoryToStoryResponse(Story story) {
        return StoryList.builder()
                .available(story.getAvailable())
                .returned(story.getReturned())
                .collectionURI(story.getCollectionURI())
                .items(story.getItems())
                .build();
    }

    private static List<StorySummaryResponse> fromStorySummaryToStorySummaryResponse(List<StorySummary> storySummaries) {
        List<StorySummaryResponse> storySummaryResponses = new ArrayList<>();

        storySummaries.forEach(storySummary -> storySummaryResponses.add(
                new StorySummaryResponse(storySummary.getResourceURI(), storySummary.getName(), storySummary.getType())
        ));

        return storySummaryResponses;
    }
}

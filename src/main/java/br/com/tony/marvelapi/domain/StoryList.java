package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Builder
@Getter
public class StoryList {
    private final Integer available;
    private final String collectionURI;
    private final List<StorySummary> items;
    private final Integer returned;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoryList storyList = (StoryList) o;
        return Objects.equals(available, storyList.available) && Objects.equals(collectionURI, storyList.collectionURI) && Objects.equals(items, storyList.items) && Objects.equals(returned, storyList.returned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(available, collectionURI, items, returned);
    }
}

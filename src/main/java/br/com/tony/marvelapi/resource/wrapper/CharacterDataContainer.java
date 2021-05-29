package br.com.tony.marvelapi.resource.wrapper;

import br.com.tony.marvelapi.dto.response.CharacterResponse;

import java.util.List;

public class CharacterDataContainer<T> {

    private final long offset;
    private final int limit;
    private final long total;
    private final int count;
    private final List<T> results;

    public CharacterDataContainer(long offset, int limit, long total, int count, List<T> results) {
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

    public List<T> getResults() {
        return results;
    }

    public long getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    public long getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }
}

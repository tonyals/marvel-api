package br.com.tony.marvelapi.dto.response;

public final class ComicSummaryResponse {
    private final String resourceURI;
    private final String name;

    public ComicSummaryResponse(String resourceURI, String name) {
        this.resourceURI = resourceURI;
        this.name = name;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public String getName() {
        return name;
    }
}

package br.com.tony.marvelapi.dto.response;

public final class EventSummaryResponse {
    private final String resourceURI;
    private final String name;

    public EventSummaryResponse(String resourceURI, String name) {
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

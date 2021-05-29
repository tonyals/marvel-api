package br.com.tony.marvelapi.dto.response;

public final class StorySummaryResponse {
    private final String resourceURI;
    private final String name;
    private final String type;

    public StorySummaryResponse(String resourceURI, String name, String type) {
        this.resourceURI = resourceURI;
        this.name = name;
        this.type = type;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

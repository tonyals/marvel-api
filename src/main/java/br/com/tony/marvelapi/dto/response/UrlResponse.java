package br.com.tony.marvelapi.dto.response;

public final class UrlResponse {
    private final String type;
    private final String url;

    public UrlResponse(String type, String url) {
        this.type = type;
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }
}

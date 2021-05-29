package br.com.tony.marvelapi.dto.response;

public final class ImageResponse {
    private final String path;
    private final String extension;

    public ImageResponse(String path, String extension) {
        this.path = path;
        this.extension = extension;
    }

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }
}

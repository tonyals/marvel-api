package br.com.tony.marvelapi.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Builder
@Getter
public final class ImageResponse {
    private final String path;
    private final String extension;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageResponse that = (ImageResponse) o;
        return Objects.equals(path, that.path) && Objects.equals(extension, that.extension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, extension);
    }
}

package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Builder
@Getter
public class Image {
    private final String path;
    private final String extension;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(path, image.path) && Objects.equals(extension, image.extension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, extension);
    }
}

package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.Image;

public class ImageMock {
    public static Image createImage() {
        return Image.builder()
                .path("image/path")
                .extension("jpg")
                .build();
    }
}

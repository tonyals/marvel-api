package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Image;
import br.com.tony.marvelapi.dto.response.ImageResponse;

public class ImageConverter {
    public static ImageResponse fromImageToImageResponse(Image image) {
        return ImageResponse.builder()
                .path(image.getPath())
                .extension(image.getExtension())
                .build();
    }
}

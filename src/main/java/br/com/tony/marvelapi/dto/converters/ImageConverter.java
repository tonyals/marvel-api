package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Image;
import br.com.tony.marvelapi.dto.response.ImageResponse;

public class ImageConverter {
    public static ImageResponse fromImageToImageResponse(Image image) {
        return new ImageResponse(image.getPath(), image.getExtension());
    }
}

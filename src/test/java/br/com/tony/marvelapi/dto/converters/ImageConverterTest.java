package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Image;
import br.com.tony.marvelapi.dto.response.ImageResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImageConverterTest {

    @Test
    @DisplayName("garante que um ImageResponse completo é retornado pelo converter")
    void returnCompleteImageResponseSuccessTest() {
        //  Given
        var imageStub = createImage();

        //  When
        var response = ImageConverter
                .fromImageToImageResponse(imageStub);

        //  Then
        assertEquals(response, imageResponseStub());
    }

    private static ImageResponse imageResponseStub() {
        var image = createImage();
        return ImageResponse.builder()
                .path(image.getPath())
                .extension(image.getExtension())
                .build();
    }

    private static Image createImage() {
        return Image.builder()
                .path("image/path")
                .extension("jpg")
                .build();
    }
}

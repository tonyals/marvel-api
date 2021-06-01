package br.com.tony.marvelapi.converters;

import br.com.tony.marvelapi.domain.Url;
import br.com.tony.marvelapi.dto.response.UrlResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UrlConverterTest {

    @Test
    @DisplayName("garante que um UrlResponse completo é retornado pelo converter")
    void returnCompleteUrlResponseSuccessTest() {
        //  Given
        var urlsStub = createUrls();

        //  When
        var response = UrlConverter
                .fromUrlToUrlResponse(urlsStub);

        //  Then
        assertEquals(response, urlResponseStub());
    }

    public static List<UrlResponse> urlResponseStub() {
        List<Url> urls = createUrls();
        List<UrlResponse> urlResponses = new ArrayList<>();

        urls.forEach(url -> urlResponses.add(
                UrlResponse.builder()
                        .url(url.getUrl())
                        .type(url.getType())
                        .build()
        ));

        return urlResponses;
    }

    private static List<Url> createUrls() {
        return Arrays.asList(
                Url.builder()
                        .id(1L)
                        .url("url 1 here")
                        .type("type url here")
                        .build(),
                Url.builder()
                        .id(2L)
                        .url("url 2 here")
                        .type("type url here")
                        .build()
        );
    }
}

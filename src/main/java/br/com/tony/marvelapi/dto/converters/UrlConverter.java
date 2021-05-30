package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Url;
import br.com.tony.marvelapi.dto.response.UrlResponse;

import java.util.ArrayList;
import java.util.List;

public class UrlConverter {
    public static List<UrlResponse> fromUrlToUrlResponse(List<Url> urls) {
        List<UrlResponse> urlResponses = new ArrayList<>();

        urls.forEach(url -> urlResponses.add(
                UrlResponse.builder()
                        .url(url.getUrl())
                        .type(url.getType())
                        .build()
        ));

        return urlResponses;
    }
}

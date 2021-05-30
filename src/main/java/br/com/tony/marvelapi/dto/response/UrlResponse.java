package br.com.tony.marvelapi.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Builder
@Getter
public final class UrlResponse {
    private final String type;
    private final String url;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UrlResponse that = (UrlResponse) o;
        return Objects.equals(type, that.type) && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url);
    }
}

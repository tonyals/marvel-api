package br.com.tony.marvelapi.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Builder
@Getter
public class TextObject {
    private final String type;
    private final String language;
    private final String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextObject that = (TextObject) o;
        return Objects.equals(type, that.type) && Objects.equals(language, that.language) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, language, text);
    }
}

package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.TextObject;

public class TextObjectMock {

    public static TextObject createTextObject() {
        return TextObject.builder()
                .language("language here")
                .text("text here")
                .type("type here")
                .build();
    }
}

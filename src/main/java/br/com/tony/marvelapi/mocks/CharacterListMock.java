package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.CharacterList;
import br.com.tony.marvelapi.domain.CharacterSummary;
import br.com.tony.marvelapi.domain.ComicList;
import br.com.tony.marvelapi.domain.ComicSummary;

import java.util.Collections;

public class CharacterListMock {

    public static CharacterList createCharacterList() {
        return CharacterList.builder()
                .available(10)
                .returned(10)
                .collectionURI("collection uri")
                .items(Collections.singletonList(
                        CharacterSummary.builder()
                                .name("name")
                                .resourceURI("resource uri")
                                .role("role")
                                .build()
                ))
                .build();
    }
}

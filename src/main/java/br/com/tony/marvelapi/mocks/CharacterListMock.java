package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.CharacterList;

import java.util.Collections;

public class CharacterListMock {

    public static CharacterList createCharacterList() {
        return CharacterList.builder()
                .available(10)
                .returned(10)
                .collectionURI("collection uri")
                .items(Collections.singletonList(CharacterSummaryMock.createCharacterSummary()))
                .build();
    }
}

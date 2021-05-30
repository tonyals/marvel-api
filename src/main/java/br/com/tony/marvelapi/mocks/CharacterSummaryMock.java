package br.com.tony.marvelapi.mocks;

import br.com.tony.marvelapi.domain.CharacterSummary;

public class CharacterSummaryMock {

    public static CharacterSummary createCharacterSummary() {
        return CharacterSummary.builder()
                .name("name")
                .resourceURI("resource uri")
                .role("role")
                .build();
    }
}

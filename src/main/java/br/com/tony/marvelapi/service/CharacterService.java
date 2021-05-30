package br.com.tony.marvelapi.service;

import br.com.tony.marvelapi.dto.response.*;

import java.util.List;

public interface CharacterService {
    List<CharacterResponse> getAll();
    CharacterResponse getById(Long id);
    ComicResponse getComicByCharacterId(Long characterId);
    EventResponse getEventByCharacterId(Long characterId);
    SeriesResponse getSeriesByCharacterId(Long characterId);
    StoryResponse getStoryByCharacterId(Long characterId);
}

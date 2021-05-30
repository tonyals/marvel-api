package br.com.tony.marvelapi.dto.converters;

import br.com.tony.marvelapi.domain.Comic;
import br.com.tony.marvelapi.domain.ComicSummary;
import br.com.tony.marvelapi.domain.ComicList;
import br.com.tony.marvelapi.dto.response.ComicResponse;
import br.com.tony.marvelapi.dto.response.ComicSummaryResponse;

import java.util.ArrayList;
import java.util.List;

public class ComicConverter {
    public static ComicResponse fromComicToComicResponse(Comic comic) {
        return ComicResponse.builder()
                .id(comic.getId())
                .digitalId(comic.getDigitalId())
                .title(comic.getTitle())
                .issueNumber(comic.getIssueNumber())
                .variantDescription(comic.getVariantDescription())
                .description(comic.getDescription())
                .isbn(comic.getIsbn())
                .upc(comic.getUpc())
                .diamondCode(comic.getDiamondCode())
                .ean(comic.getEan())
                .issn(comic.getIssn())
                .format(comic.getFormat())
                .pageCount(comic.getPageCount())
                .textObjects(comic.getTextObjects())
                .resourceURI(comic.getResourceURI())
                .urlResponses(UrlConverter.fromUrlToUrlResponse(comic.getUrls()))
                .series(comic.getSeries())
                .variants(comic.getVariants())
                .collections(comic.getCollections())
                .collectedIssues(comic.getCollectedIssues())
                .dates(comic.getDates())
                .prices(comic.getPrices())
                .imageResponse(ImageConverter.fromImageToImageResponse(comic.getThumbnail()))
                .creatorsList(comic.getCreators())
                .charactersList(comic.getCharacters())
                .storyList(comic.getStories())
                .eventList(comic.getEvents())
                .available(comic.getAvailable())
                .returned(comic.getReturned())
                .collectionURI(comic.getCollectionURI())
                .items(comic.getItems())
                .build();
    }

    public static ComicList fromComicToComicList(Comic comic) {
        return ComicList.builder()
                .available(comic.getAvailable())
                .collectionURI(comic.getCollectionURI())
                .items(comic.getItems())
                .returned(comic.getReturned())
                .build();
    }

    private static List<ComicSummaryResponse> fromComicSummaryToComicSummaryResponse(List<ComicSummary> comicSummaries) {
        List<ComicSummaryResponse> comicSummaryResponses = new ArrayList<>();

        comicSummaries.forEach(comicSummary -> comicSummaryResponses.add(
                new ComicSummaryResponse(comicSummary.getResourceURI(), comicSummary.getName())
        ));

        return comicSummaryResponses;
    }
}

package br.com.tony.marvelapi.resource.handler;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorMessage {
    private final String message;
    private final Integer statusCode;
}

package br.com.tony.marvelapi.resource.handler;

import br.com.tony.marvelapi.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorMessage> handleBusinessException(BusinessException e) {
        return new ResponseEntity<>(ErrorMessage.builder()
                .message(e.getMessage())
                .statusCode(e.getHttpStatus().value())
                .build(), e.getHttpStatus());
    }
}

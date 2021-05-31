package br.com.tony.marvelapi.resource.handler;

import br.com.tony.marvelapi.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    private static final String INTERNAL_SERVER_ERROR_MESSAGE = "Internal Error";

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorMessage> handleBusinessException(BusinessException e) {
        return new ResponseEntity<>(ErrorMessage.builder()
                .message(e.getMessage())
                .statusCode(e.getHttpStatus().value())
                .build(), e.getHttpStatus());
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<ErrorMessage> handleInternalException(Throwable e) {
        return new ResponseEntity<>(ErrorMessage.builder()
                .message(INTERNAL_SERVER_ERROR_MESSAGE)
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

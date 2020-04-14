package com.togo.accounting.exception;

import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description
 * @create 2020-04-14 21:27
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException ex){
        val errorResponse = ErrorResponse.builder()
                                         .code("USER_NOT_FOUND")
                                         .errorType(ServiceException.errorType.Client)
                                         .message(ex.getMessage())
                                         .statusCode(HttpStatus.NOT_FOUND.value())
                                         .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body(errorResponse);
    }
}

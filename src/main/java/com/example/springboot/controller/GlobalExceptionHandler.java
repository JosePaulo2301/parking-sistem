package com.example.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.function.Function;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Map<Class<? extends Exception>, Function<Exception, ResponseEntity<ProblemDetail>>> exceptionHandlers = Map.of(
            ResourceNotFoundException.class,ex -> createResponse(ex, HttpStatus.NOT_FOUND),
            IllegalArgumentException.class, ex -> createResponse(ex, HttpStatus.BAD_REQUEST),
            Exception.class,                ex -> createResponse(ex, HttpStatus.INTERNAL_SERVER_ERROR)
    );

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ProblemDetail> handleException(Exception ex) {
        return exceptionHandlers
                .getOrDefault(ex.getClass(), e -> createResponse(e, HttpStatus.INTERNAL_SERVER_ERROR))
                .apply(ex);
    }

    private static ResponseEntity<ProblemDetail> createResponse(Exception ex, HttpStatus status) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(status, ex.getMessage());
        return ResponseEntity.status(status).body(problemDetail);
    }
}

package com.example.springboot.controller;

import com.example.springboot.exception.RecordNotFoundException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.function.Function;


public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException (String mensagem) {
        super(mensagem);
    }


}

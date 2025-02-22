package com.example.personajes.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotFoundException extends RuntimeException{
    public NotFoundException(String elementName){
        super("The element: " +elementName+ " was not found");
    }
}

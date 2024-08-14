package com.panha.java.phoneTest.Exception;

import org.springframework.http.HttpStatus;

public class ResourceException extends ApiException {

    public ResourceException(String resourceName, Integer id) {
        super(HttpStatus.NOT_FOUND,String.format("%s with id = %d not found",resourceName,id));
    }
}

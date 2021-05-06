package com.kagency.kagencyapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class KAuthException extends RuntimeException {

    public KAuthException(String message) {
        super(message);
    }
}

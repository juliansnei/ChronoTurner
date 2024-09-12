package org.springboot.riwi.chronoturner.backend.dtos.exception;

public class NoUserIdException extends RuntimeException {
    public NoUserIdException(String message) {
        super(message);
    }
}

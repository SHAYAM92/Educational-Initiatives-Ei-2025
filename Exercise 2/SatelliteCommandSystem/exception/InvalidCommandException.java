package com.example.satellite.exception;

public class InvalidCommandException extends Exception {
    public InvalidCommandException(String message) {
        super(message);
    }
}
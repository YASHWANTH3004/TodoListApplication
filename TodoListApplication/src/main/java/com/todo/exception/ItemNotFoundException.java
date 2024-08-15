package com.todo.exception;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(Long id) {
        super("Could not found the user with id " + id);
    }
}
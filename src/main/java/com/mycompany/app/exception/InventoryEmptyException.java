package com.mycompany.app.exception;

public class InventoryEmptyException extends RuntimeException {

    public InventoryEmptyException() {
    }

    public InventoryEmptyException(String message) {
        super(message);
    }

    public InventoryEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryEmptyException(Throwable cause) {
        super(cause);
    }
}

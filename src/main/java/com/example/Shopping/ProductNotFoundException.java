package com.example.Shopping;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String messageError) {
        super(messageError);
    }
}

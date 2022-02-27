package com.example.Shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

    @Autowired
    private ShoppingService shoppingService;

    @GetMapping("/api/v1/products/{productID}")
    public ShoppingResponse getProductDetail(@PathVariable int productID) {
        return new ShoppingResponse(shoppingService.getProductDetail(productID));
    }

}

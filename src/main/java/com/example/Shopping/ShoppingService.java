package com.example.Shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ShoppingService {

    @Autowired
    private ShoppingRepository shoppingRepository;
    private String messageError;

    public String getProductDetail(int productID) {
        Optional<Product> data = shoppingRepository.findById(productID);
        if (data.isPresent()) {
            return data.get().getName();
        }
        this.messageError = String.valueOf(productID);
        throw new ProductNotFoundException(messageError);
    }

    public void setShoppingRepository(ShoppingRepository shoppingRepository) {
        this.shoppingRepository = shoppingRepository;
    }
}

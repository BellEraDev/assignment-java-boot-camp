package com.example.Shopping;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ShoppingServiceTest {

    @Mock
    private ShoppingRepository shoppingRepository;

    @Test
    void getProductDetail() {
        //Arrange
        Product product = new Product();
        product.setId(12345);
        product.setName("testing");
        when(shoppingRepository.findById(12345)).thenReturn(Optional.of(product));
        // Act
        ShoppingService shoppingService = new ShoppingService();
        shoppingService.setShoppingRepository(shoppingRepository);
        String result = shoppingService.getProductDetail(12345);
        //Assert
        assertEquals("testing", result);
    }
}
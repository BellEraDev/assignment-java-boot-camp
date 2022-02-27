package com.example.Shopping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ShoppingRepositoryTest {

    @Autowired
    private ShoppingRepository shoppingRepository;

    @Test
    void findById_with_success() {
        //Arrange
        Product product = new Product();
        product.setId(12345);
        product.setName("testing");
        shoppingRepository.save(product);
        //Act
        Optional<Product> result = shoppingRepository.findById(12345);
        //Assert
        assertTrue(result.isPresent());
    }

    @Test
    void findById_with_failure() {
        //Act
        Optional<Product> result = shoppingRepository.findById(1234);
        //Assert
        assertFalse(result.isPresent());
    }
}
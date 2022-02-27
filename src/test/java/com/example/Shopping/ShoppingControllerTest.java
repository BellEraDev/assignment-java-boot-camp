package com.example.Shopping;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ShoppingControllerTest {

@Autowired
private TestRestTemplate testRestTemplate;

@MockBean
private ShoppingRepository shoppingRepository;

    @Test
    @DisplayName("ส่ง productID = 12345 แล้วจะต้องได้รับข้อความ testing")
    void case01() {
        //Arrange
        Product product = new Product();
        product.setId(12345);
        product.setName("testing");
        when(shoppingRepository.findById(12345)).thenReturn(Optional.of(product));
        //Act
        ShoppingResponse result = testRestTemplate.getForObject("/api/v1/products/12345", ShoppingResponse.class);
        //Assert, verify
        assertEquals("testing", result.getProductDetail());
    }

    @Test
    @DisplayName("ส่ง productID = 1234 แล้วจะต้องได้รับข้อความ ProductID=1234 not found")
    void case02() {
        //Arrange
        Product product = new Product();
        product.setId(12345);
        product.setName("testing");
        when(shoppingRepository.findById(12345)).thenReturn(Optional.of(product));
        //Act
        ShoppingResponse result = testRestTemplate.getForObject("/api/v1/products/1234", ShoppingResponse.class);
        //Assert, verify
        assertEquals("productID=1234 not found", result.getProductDetail());
    }
}
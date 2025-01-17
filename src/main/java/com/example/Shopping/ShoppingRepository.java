package com.example.Shopping;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShoppingRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findById(int productID);

}

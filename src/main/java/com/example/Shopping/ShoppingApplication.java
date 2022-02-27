package com.example.Shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ShoppingApplication {

	@Autowired
	private ShoppingRepository shoppingRepository;

	@PostConstruct
	@Transactional
	public void addProductDetail() {
		Product product = new Product();
		product.setId(12345);
		product.setName("watcharpun");
		shoppingRepository.save(product);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

}

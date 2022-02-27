package com.example.Shopping.products;


import com.example.Shopping.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductGateway {

    @Autowired
    private RestTemplate restTemplate;
    private String baseUrl;

    public ProductGateway(@Value("${base_url}") String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public ProductResponse getProductById(int id) {

        ProductResponse response = restTemplate.getForObject(this.baseUrl + "products/" + id, ProductResponse.class);
        return response;
    }
}

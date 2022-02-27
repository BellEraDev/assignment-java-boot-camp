package com.example.Shopping;

public class ShoppingResponse {
    private String status;
    private String productDetail;

    public ShoppingResponse() {
    }

    public ShoppingResponse(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }
}

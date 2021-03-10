package com.pentazon.product;

import java.math.BigDecimal;

public class Product {
    private String ProductId;
    private String productName;
    private String description;
    private BigDecimal price;

    public Product() {
    }

    public Product(String productName, String description, BigDecimal price) {
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

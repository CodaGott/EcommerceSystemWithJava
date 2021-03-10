package com.pentazon.product;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class ProductServiceImplTest {

    ProductService productService;

    @BeforeEach
    void setUp() {
        productService = new ProductServiceImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findProduct(){
        Product product = null;
        Product product = productService.findProductById("AD001");
        assertNotNull(product);
    }


}
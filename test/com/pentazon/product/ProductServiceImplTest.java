package com.pentazon.product;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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
        Product product = productService.findProductById("AD001");
        assertNotNull(product);
    }

//    @Test

}
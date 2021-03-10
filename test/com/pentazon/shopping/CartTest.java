package com.pentazon.shopping;

import com.pentazon.product.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CartTest {

    Cart cart;

    @BeforeEach
    void setUp() {
        cart = new Cart();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addToCart(){
        assertTrue(cart.getItems().isEmpty());
        Product testProduct = new Product();
        cart.addToCart(testProduct);
        assertFalse(cart.getItems().isEmpty());
        assertEquals(1, cart.getItems().size());
    }
    
    @Test
    void removeFromCart(){
        assertTrue(cart.getItems().isEmpty());
        Product plantainChips = new Product("Plantain Chips", "Semicolon chips",
                new BigDecimal(50.00));
        plantainChips.setProductId("AD001");
        cart.addToCart(plantainChips);
        assertFalse(cart.getItems().isEmpty());
        assertEquals(1, cart.getItems().size());

        boolean result = cart.removeFromCart(plantainChips);
        assertTrue(result);
        assertTrue(cart.getItems().isEmpty());
    }
}
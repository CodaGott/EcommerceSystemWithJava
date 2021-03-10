package com.pentazon.product;

/**
 * Provide services for dealing with products in Pentazon
 */

public interface ProductService {
    /**
     * search for product with the specified id
     * @param productId
     * @return
     */
    Product findProduct(String productId);
}

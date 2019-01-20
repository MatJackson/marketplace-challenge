package com.mycompany.app.service;

import com.mycompany.app.model.Product;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

@Validated
public interface ProductService {

    @NotNull
    Iterable<Product> getAllProducts();

    @NotNull
    Iterable<Product> getAllAvailableProducts();

    Product getProductById(@Min(value = 1L, message = "Invalid product ID.") long id);

    Iterable<Product> getProductsByTitle(String title);

    Iterable<Product> getProductsInPriceRange(@PositiveOrZero double priceFloor, @Positive double priceCeiling);

    Product save(Product product);
}

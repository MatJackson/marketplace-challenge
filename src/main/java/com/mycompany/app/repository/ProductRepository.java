package com.mycompany.app.repository;

import com.mycompany.app.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
    Iterable<Product> findByInventoryGreaterThan(int inventoryCount);

    Iterable<Product> findByTitleIsContaining(String title);

    Iterable<Product> findByPriceBetween(double priceFrom, double priceTo);
}

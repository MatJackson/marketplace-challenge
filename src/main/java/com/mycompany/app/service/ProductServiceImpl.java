package com.mycompany.app.service;

import com.mycompany.app.exception.ResourceNotFoundException;
import com.mycompany.app.model.Product;
import com.mycompany.app.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Iterable<Product> getAllAvailableProducts() {
        return productRepository.findByInventoryGreaterThan(0);
    }

    @Override
    public Product getProductById(long id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Iterable<Product> getProductsByTitle(String title) {
        return productRepository.findByTitleIsContaining(title);
    }

    @Override
    public Iterable<Product> getProductsInPriceRange(@PositiveOrZero double priceFloor, @Positive double priceCeiling) {
        return productRepository.findByPriceBetween(priceFloor, priceCeiling);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}

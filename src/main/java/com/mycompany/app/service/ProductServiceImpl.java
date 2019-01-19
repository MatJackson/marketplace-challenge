package com.mycompany.app.service;

import com.mycompany.app.exception.ResourceNotFoundException;
import com.mycompany.app.model.Product;
import com.mycompany.app.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public Product getProduct(long id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }


}

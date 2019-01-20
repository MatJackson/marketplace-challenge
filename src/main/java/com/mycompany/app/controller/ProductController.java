package com.mycompany.app.controller;

import com.mycompany.app.exception.InventoryEmptyException;
import com.mycompany.app.model.Product;
import com.mycompany.app.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/in-stock")
    public @NotNull Iterable<Product> getAvailableProducts() {
        return productService.getAllAvailableProducts();
    }

    @GetMapping("/id/{id}")
    public @NotNull Product getProductById(@PathVariable long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/title/{title}")
    public @NotNull Iterable<Product> getProductByTitle(@PathVariable String title) {
        return productService.getProductsByTitle(title);
    }

    @GetMapping("/priceRange/{priceFrom}/{priceTo}")
    public @NotNull Iterable<Product> getProductsInPriceRange(@PathVariable("priceFrom") double priceFrom,
                                                              @PathVariable("priceTo") double priceTo) {
        return productService.getProductsInPriceRange(priceFrom, priceTo);
    }

    @GetMapping("/purchase/{id}")
    public @NotNull ResponseEntity<Product> purchaseProduct(@PathVariable long id) {
        try {
            return new ResponseEntity<>(productService.purchase(id), HttpStatus.ACCEPTED);
        } catch (InventoryEmptyException e) {
            return new ResponseEntity<>(productService.getProductById(id), HttpStatus.BAD_REQUEST);
        }
    }
}

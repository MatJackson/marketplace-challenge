package com.mycompany.app.controller;

import com.mycompany.app.model.Product;
import com.mycompany.app.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Product> getProducts(@RequestParam(value="only-available", defaultValue="false") boolean available) {
        if (available) {
            return productService.getAllAvailableProducts();
        } else {
            return productService.getAllProducts();
        }
    }

    @GetMapping("/id")
    public @NotNull Product getProductById(@RequestParam(value="id") long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/title")
    public @NotNull Iterable<Product> getProductByTitle(@RequestParam(value="title") String title) {
        return productService.getProductsByTitle(title);
    }

    @GetMapping("/priceRange")
    public @NotNull Iterable<Product> getProductsInPriceRange(@RequestParam(value="priceFrom") double priceFrom,
                                                              @RequestParam(value="priceTo") double priceTo) {
        return productService.getProductsInPriceRange(priceFrom, priceTo);
    }
}

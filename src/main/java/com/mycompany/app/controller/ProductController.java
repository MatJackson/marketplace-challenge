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

    @GetMapping("/purchase")
    public @NotNull ResponseEntity<Product> purchaseProduct(@RequestParam(value="id") long id) {
        try {
            return new ResponseEntity<Product>(productService.purchase(id), HttpStatus.ACCEPTED);
        } catch (InventoryEmptyException e) {
            return new ResponseEntity<Product>(productService.getProductById(id), HttpStatus.BAD_REQUEST);
        }
    }
}

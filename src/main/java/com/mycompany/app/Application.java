package com.mycompany.app;

import com.mycompany.app.model.Product;
import com.mycompany.app.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "Coasters", 12.99, 23));
            productService.save(new Product(2L, "In Rainbows Vinyl", 29.99, 12));
            productService.save(new Product(3L, "Radiohead Mug", 7.99, 4));
            productService.save(new Product(4L, "Stick-It Notes", 2.99, 40));
            productService.save(new Product(5L, "Measuring Tape", 9.99, 4));
            productService.save(new Product(6L, "Book", 15.99, 12));
            productService.save(new Product(7L, "Asus Monitor", 300.00, 1));
            productService.save(new Product(8L, "Headphones", 59.99, 5));
            productService.save(new Product(9L, "Xbox", 250.00, 2));
            productService.save(new Product(10L, "Potted Plant", 15.00, 0));
            productService.save(new Product(11L, "Desk", 150.00, 4));
            productService.save(new Product(12L, "Chair", 50.00, 2));
            productService.save(new Product(13L, "Mason Jar", 2.99, 48));
            productService.save(new Product(14L, "Pen", 3.99, 6));
            productService.save(new Product(15L, "Tick Tacks", 2.99, 100));
            productService.save(new Product(16L, "Backpack", 29.99, 3));
            productService.save(new Product(17L, "Fishnet Stockings", 16.88, 18));
            productService.save(new Product(18L, "Echo Dot", 69.99, 2));
            productService.save(new Product(19L, "Humidifier", 99.99, 6));
            productService.save(new Product(20L, "Alarm Clock", 16.99, 8));
        };
    }
}

package com.mycompany.app.modelTests;

import com.mycompany.app.models.Product;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void t001_inventoryNotEmptyTest() {
        Product product = new Product(1, "Test Product", 5.99, 1);
        assertTrue("Inventory Count is greater than 0", product.inventoryNotEmpty());

        product.setInventory_count(10);
        assertTrue("Inventory Count is greater than 0", product.inventoryNotEmpty());

        product.setInventory_count(0);
        assertFalse("Inventory Count is 0", product.inventoryNotEmpty());
    }
}

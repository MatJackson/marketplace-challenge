package com.mycompany.app.modelTests;

import com.mycompany.app.model.Product;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void t001_inventoryEmptyTest() {
        Product product = new Product(1, "Test Product", 5.99, 1);
        assertFalse("Inventory Count is greater than 0", product.inventoryEmpty());

        product.setInventory(10);
        assertFalse("Inventory Count is greater than 0", product.inventoryEmpty());

        product.setInventory(0);
        assertTrue("Inventory Count is 0", product.inventoryEmpty());
    }
}

package com.mycompany.app.modelTests;

import com.mycompany.app.exception.InventoryEmptyException;
import com.mycompany.app.model.Product;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {
    Product product;

    @Before
    public void setup() {
        product = new Product(1, "Test Product", 5.99, 1);
    }

    @Test
    public void t001_inventoryEmptyTest() {
        assertFalse("Inventory Count is greater than 0", product.inventoryEmpty());

        product.setInventory(10);
        assertFalse("Inventory Count is greater than 0", product.inventoryEmpty());

        product.setInventory(0);
        assertTrue("Inventory Count is 0", product.inventoryEmpty());
    }

    @Test
    public void t002_decrementInventoryTest() {
        product.decrementInventory();

        assertEquals("Did not decrement inventory", 0, product.getInventory());

        try {
            product.decrementInventory();
            fail("Did not properly throw exception when attempting to decrement inventory");
        } catch (InventoryEmptyException e) {

        }
    }
}

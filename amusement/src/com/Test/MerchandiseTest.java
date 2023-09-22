package com.Test;



import static org.junit.Assert.*;
import org.junit.Test;

import com.model.Merchandise;

public class MerchandiseTest {

    @Test
    public void testMerchandiseConstruction() {
        Merchandise merchandise = new Merchandise(101, "T-shirt", "Park Logo T-shirt", 300, true);
        assertNotNull(merchandise);
        assertEquals(101, merchandise.getId());
        assertEquals("T-shirt", merchandise.getCategory());
        assertEquals("Park Logo T-shirt", merchandise.getDescription());
        assertEquals(300, merchandise.getPrice(), 0.01);
        assertTrue(merchandise.isInStock());
    }

    @Test
    public void testMerchandiseToString() {
        Merchandise merchandise = new Merchandise(102, "Cap", "Ferris Wheel Cap", 460, true);
        String expectedString = "Merchandise [id=102, category=Cap, description=Ferris Wheel Cap, price=460.0, inStock=true]";
        assertEquals(expectedString, merchandise.toString());
    }

}
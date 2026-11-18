package com.mycompany.question_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    public ProductTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
        int[][] ProductSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        Product instance = new Product();
        int expResult = 153;
        int result = instance.GetTotalProductsSold(ProductSales);
        assertEquals(expResult, result);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        int[][] ProductSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        Product instance = new Product();
        double expResult = 17;
        double result = instance.GetAverageProductSold(ProductSales);
        assertEquals(expResult, result, 0);
    }

}

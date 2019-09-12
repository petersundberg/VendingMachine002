package ecutb.peter;

import org.junit.Assert;
import org.junit.Test;

public class FruitTest {
    static Product [] products = new Product[3];

    @Test
    public void test_fruit_test(){
        products[0]  = new Fruit(1, "Apple", 10, 100, "No allergen");
        products[1]  = new Fruit(2, "Orange", 12, 110, "No allergen");
        products[2]  = new Fruit(3, "Melon", 110, 100, "No allergen");
        String expectedOutput = "1 is used Apple";
        Assert.assertEquals(expectedOutput, products[0].use(1));
    }
}

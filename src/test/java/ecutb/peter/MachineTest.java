package ecutb.peter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MachineTest {
    Product[] products;
    Machine machine;
    @Before
    public void before_test() {
        products = new Product[3];
        products[0]  = new Fruit(1, "Apple", 10, 100, "No allergen");
        products[1]  = new Fruit(2, "Orange", 12, 110, "No allergen");
        products[2]  = new Fruit(3, "Melon", 110, 100, "No allergen");
        machine = new Machine(products);

    }
    @Test
    public void add_currency_test(){
        int expectedValue = 100;
        machine.addCurrency(100);
        Assert.assertEquals(expectedValue, machine.getBalance());

        int expectedValue1 = 105;
        machine.addCurrency(5);
        Assert.assertEquals(expectedValue1, machine.getBalance());

        int expectedVale2 = 105;
        machine.addCurrency(2);
        Assert.assertEquals(expectedVale2, machine.getBalance());
}
    @Test
    public void test_request(){
        machine.addCurrency(100);
        int expectedValue1 = 90;
        machine.request(1);
        Assert.assertEquals(expectedValue1, machine.getBalance());
//        Assert.assertNotNull(machine.request(1));
//        Assert.assertNull(machine.request(4));

        int expectedValue2 = 78;
        machine.request(2);
        Assert.assertEquals(expectedValue2, machine.getBalance());
}

@Test
    public void test_end_session(){
    machine.addCurrency(500);
    machine.request(1);
    machine.request(2);
    int expectedValue1 = 478;
    Assert.assertEquals(expectedValue1, machine.endSession());

    Machine machine1 = new Machine(products);
    machine1.addCurrency(10);
    machine1.request(1);
    int expectedValue2 = 0;
    Assert.assertEquals(expectedValue2, machine1.endSession());
}
    @Test
    public void test_examine(){
        String expectedOutput1 ="The product is: \nPrice: 12\nName: Orange\nCalorie: 110\nAllergens: No allergen";
        Assert.assertEquals(expectedOutput1, machine.getDescription(2).trim());

        Assert.assertNull(machine.getDescription(5));
    }

    @Test
    public void test_get_product(){
        /*
        String[] expectedOutput = new String[3];
        expectedOutput[0] = "The product is: \nPrice: 10\nName: Apple\nCalorie: 100\nAllergens: No allergen\n";
        expectedOutput[1] = "The product is: \nPrice: 12\nName: Orange\nCalorie: 110\nAllergens: No allergen\n";
        expectedOutput[2] = "The product is: \nPrice: 110\nName: Melon\nCalorie: 100\nAllergens: No allergen\n";
        */

        int expectedLength = 3;

        Assert.assertEquals(expectedLength, machine.getProducts().length);
    }

}

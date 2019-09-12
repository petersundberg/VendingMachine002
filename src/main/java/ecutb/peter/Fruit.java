package ecutb.peter;

public class Fruit extends Product {

    public Fruit(int productNumber, String name, int price, int calorie, String allergens) {
        super(productNumber, name, price, calorie, allergens);
    }

    @Override
    public String use(int productNumber) {

        return "The fruit " + getName() + " is used " + "with " + productNumber;
    }
}

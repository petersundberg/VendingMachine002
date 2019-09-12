package ecutb.peter;

public class Godis extends Product {
    public Godis(int productNumber, String name, int price, int calorie, String allergens) {
        super(productNumber, name, price, calorie, allergens);
    }

    @Override
    public String use(int productNumber) {
        return "The Candy " + getName() + " is used " + "with " + productNumber;
    }
}

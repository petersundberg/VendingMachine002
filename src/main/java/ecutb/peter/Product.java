package ecutb.peter;

public abstract class Product {
   private int productNumber;
    private int price;
   private String name;
    private int calorie;
   private String allergens;

    public Product(int productNumber, String name, int price, int calorie, String allergens) {
        this.productNumber = productNumber;
        this.price = price;
        this.name = name;
        this.calorie = calorie;
        this.allergens = allergens;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public String examine(){
        return "The product is: " +
                "Price: " + getPrice() +
                "Name: " + getName() +
                "Calorie:" + getCalorie() +
                "Allergens: " + getAllergens();
    }

    public abstract String use(int productNumber);

}
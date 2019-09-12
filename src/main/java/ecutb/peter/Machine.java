package ecutb.peter;

public class Machine implements VendingMachine{
    private int moneyPool;
    private Product[] products;

    public Machine(Product[] content) {
        this.products= content;
    }


    @Override
    public void addCurrency(int amount) {
        //Kolla om amount är giltig mängd pengar
        for (Valör v : Valör.values()) {
            if (amount == v.getValör()) {
                moneyPool += amount;
            }
        }
    }


    @Override
    //Köpa produkten. 1. hitta produkt, 2 kontrollera pengar, 3 om tillräckligt med pengar returnera produkten
    public Product request(int productNumber) {
        for (Product product: products){
            if(product.getProductNumber() == productNumber  ){
                if(product.getPrice() <= moneyPool){
                    moneyPool -= product.getPrice();//****
                    return product;
                }
                else
                    System.out.println("you must deposit money ");
            }

        }System.out.println("product is not available");
        return null;
    }

    @Override
    //Nollställa moneypool och returnera det som fanns tillbaka som en int
    public int endSession() {
        int change = moneyPool;

        moneyPool = 0;
        return change;
    }

    @Override
    //Returnera String från examine() på produkten
    public String getDescription(int productNumber) {
        for (Product p : products){
            if(p.getProductNumber()==productNumber)
                return p.examine();
        }
        return null;
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }

    @Override
    public String[] getProducts() {
        //Måste vara lika lång som products arrayet :)
        String[] productsAsString = new String[products.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < products.length; i++){
            sb.append(products[i].examine());
            sb.append("\n");
            productsAsString[i] = sb.toString();

        }
//        System.out.println(productsAsString);
        return productsAsString;
    }




}

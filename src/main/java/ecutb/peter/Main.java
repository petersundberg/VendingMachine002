package ecutb.peter;

import java.util.Scanner;

public class Main {

/*    Följande valörer ska accepteras av automaten:
            1kr, 5kr, 10kr, 20kr, 50kr, 100kr, 500kr, 1000kr.
    Pengar som man stoppar in och accepteras av automaten ska läggas till i en insättningspool. Insättningspoolen ska representera betalningsmedel för produkten.
    Användaren ska kunna köpa flera produkter från automaten så länge det finns tillräckligt med pengar i insättningspoolen.
    När användaren beslutar att sluta köpa saker ska det som är kvar av insättningspoolen ges tillbaka till användaren som växel.
    Automaten ska ha minst tre typer av produkter i sig. (dryck, mat, godis, frukt etc.)
*/
    static Product [] products = new Product[6];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        products[0] = new Fruit(1,"Melon", 100, 10, "No allergen");
        products[1] = new Fruit(2, "Banana", 5, 20, "No idea");
        products[2] = new Godis(3, "Seg råtta", 15, 30, "Gluten");
        products[3] = new Godis(4, "Chocolate", 20, 100, "Nötter");
        products[4] = new Dryck(5, "Cola", 20, 200, "No allergen");
        products[5] = new Dryck(6, "Milk", 25, 140, "Lactos");


        Machine machine = new Machine(products);

        int money = scanner.nextInt();

        boolean keepAlive = true;
        while (keepAlive)



    }
}

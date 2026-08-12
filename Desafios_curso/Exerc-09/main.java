import entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class main {

    //    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        double avarenge = 0;
//        System.out.print("QTD de Produtos: ");
//        int qtdProd = sc.nextInt();
//        sc.nextLine();
//
//        for (int i = 0; i < qtdProd; i++) {
//            System.out.print("Name Prod: ");
//            String initName = sc.nextLine();
//
//            System.out.print("Price Prod: ");
//            double initPrice = sc.nextDouble();
//            sc.nextLine();
//
//            System.out.println(" ");
//
//            Product prod = new Product(initName, initPrice);
//
//            avarenge += prod.getPrice();
//        }
//
//        System.out.println("AVERAGE PRICE = " + (avarenge / qtdProd));
//
//    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double avarenge = 0;
        int qtdProd = sc.nextInt();
        sc.nextLine();
        Product[] prod = new Product[qtdProd];


        for (int i = 0; i < qtdProd; i++) {
            System.out.print("Name Prod: ");
            String initName = sc.nextLine();
            System.out.print("Price Prod: ");
            double initPrice = sc.nextDouble();

            prod[i] = new Product(initName, initPrice);

            avarenge += prod[i].getPrice();
        }

        System.out.println("AVERAGE PRICE =" + (avarenge / qtdProd));

    }
}

import java.util.Scanner;
import java.util.Locale;

import entities.People;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // 1.0 Exercicio Problema Negativos
//        System.out.println("NEGATIVOS");
//        System.out.println("-----------------------------------------");
//        System.out.print("Quantos numeros voce vai digitar? ");
//        int qtdNegativos = sc.nextInt();
//        int[] valueNeg = new int[qtdNegativos];
//
//
//        int j = 0;
//        while (j < valueNeg.length) {
//            System.out.print("Digite um numero: ");
//            valueNeg[j] = sc.nextInt();
//            j++;
//        }
//
//        System.out.println(" ");
//        System.out.println("NUMEROS NEGATIVOS: ");
//
//        for (int n : valueNeg) {
//            if (n < 0) {
//                System.out.println(n);
//            }
//        }

        // 2.0 Soma_Vetor
        System.out.println("soma_vetor");
        System.out.println("-----------------------------------------");

        System.out.print("Quantos numeros voce vai digitar? ");

        double[] vectSoma;
        double resultVectSoma, resultVectAvg;
        StringBuilder printResult = new StringBuilder();

        int qtdSomaVetor = sc.nextInt();
        vectSoma = new double[qtdSomaVetor];
        resultVectSoma = 0;


        for (int i = 0; i < vectSoma.length; i++) {
            System.out.print("Digite um numero: ");
            vectSoma[i] = sc.nextInt();
            resultVectSoma += vectSoma[i];
            printResult.append(vectSoma[i]).append(" ");
        }
        System.out.println(" ");
        System.out.println("VALORES = " + printResult);
        System.out.printf("SOMA = %.2f %n", resultVectSoma);
        System.out.printf("MEDIA = %.2f %n", resultVectSoma / vectSoma.length);

        //3.0 alturas
        System.out.println("Altura");
        System.out.println("-----------------------------------------");

        System.out.print("Quantos pessoas seram digitadas? ");
        int qtdPeople = sc.nextInt();
        sc.nextInt();

        People[] personVect = new People[qtdPeople];

        double AllHights = 0;
        for(int i = 0; i < personVect.length; i++){

            System.out.println("Dados da " + (i + 1) + "pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            double heigths = sc.nextInt();
            sc.nextLine();

            System.out.print("Altura: ");
            int yearsold = sc.nextInt();
            sc.nextLine();

            People person = new People(name, heigths, yearsold);
            personVect[i] = person;
            AllHights += heigths;
        }

        for(int i = 0; i < personVect.length; i++){

        }

        sc.close();
    }
}

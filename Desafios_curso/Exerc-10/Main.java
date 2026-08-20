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
//        System.out.println("soma_vetor");
//        System.out.println("-----------------------------------------");
//
//        System.out.print("Quantos numeros voce vai digitar? ");
//
//        double[] vectSoma;
//        double resultVectSoma, resultVectAvg;
//        StringBuilder printResult = new StringBuilder();
//
//        int qtdSomaVetor = sc.nextInt();
//        vectSoma = new double[qtdSomaVetor];
//        resultVectSoma = 0;
//
//
//        for (int i = 0; i < vectSoma.length; i++) {
//            System.out.print("Digite um numero: ");
//            vectSoma[i] = sc.nextInt();
//            resultVectSoma += vectSoma[i];
//            printResult.append(vectSoma[i]).append(" ");
//        }
//        System.out.println(" ");
//        System.out.println("VALORES = " + printResult);
//        System.out.printf("SOMA = %.2f %n", resultVectSoma);
//        System.out.printf("MEDIA = %.2f %n", resultVectSoma / vectSoma.length);

//        //3.0 alturas
//        System.out.println("Altura");
//        System.out.println("-----------------------------------------");
//
//        System.out.print("Quantos pessoas seram digitadas? ");
//        int qtdPeople = sc.nextInt();
//        sc.nextLine();
//
//        People[] personVect = new People[qtdPeople];
//        int avgYears = 0;
//        double avgHights = 0;
//
//        for (int i = 0; i < personVect.length; i++) {
//
//            System.out.println("Dados da " + (i + 1) + "º pessoa:");
//            System.out.print("Nome: ");
//            String name = sc.nextLine();
//
//            System.out.print("Idade: ");
//            int yearsold = sc.nextInt();
//            sc.nextLine();
//
//            System.out.print("Altura: ");
//            double heights = sc.nextDouble();
//            sc.nextLine();
//
//            People person = new People(name, heights, yearsold);
//            personVect[i] = person;
//            avgHights += heights;
//
//            if (yearsold < 16) avgYears += 1;
//
//            System.out.println(" ");
//        }
//
//        double avgSixteenPercent = (double) (avgYears * 100) / personVect.length;
//        System.out.printf("Altura média: %.2f %n", avgHights / personVect.length);
//        System.out.println("Pessoas com menos de 16 anos: " + avgSixteenPercent + "%");
//
//        for (People person : personVect) {
//            if (person.getYears() < 16) {
//                System.out.println(person.getName());
//            }
//        }

        //4.0 numeros_pares
//        System.out.println("Numeros Pares");
//        System.out.println("-----------------------------------------");
//
//        System.out.print("Quantos numeros voce vai digitar? ");
//        int qtdNumbers = sc.nextInt();
//        sc.nextLine();
//
//        int[] numberVect = new int[qtdNumbers];
//        int qtdPairNumbers = 0;
//
//        for (int i = 0; i < numberVect.length; i++) {
//            System.out.print("Digite um numero: ");
//            int numberValue = sc.nextInt();
//            sc.nextLine();
//
//            numberVect[i] = numberValue;
//
//            if (numberVect[i] % 2 == 0) qtdPairNumbers += 1;
//        }
//
//
//        int[] resultNumber = new int[qtdPairNumbers];
//        int indexResult = 0;
//        System.out.print("NUMEROS PARES: ");
//
//        for (int i = 0; i < numberVect.length; i++) {
//            if (numberVect[i] % 2 == 0) {
//                resultNumber[indexResult] = numberVect[i];
//                indexResult ++;
//
//                System.out.print(numberVect[i] + " ");
//            }
//        }
//
//
//        System.out.println(" ");
//        System.out.println("QUANTIDADE DE PARES = " + resultNumber.length);


        //5.0 maior_posicao
//        System.out.println("Maior e sua Posição");
//        System.out.println("-----------------------------------------");
//
//        System.out.print("Quantos numeros voce vai digitar? ");
//        int qtdNumbers2 = sc.nextInt();
//        sc.nextLine();
//
//        double[] allNumberBig = new double[qtdNumbers2];
//        double bigValue = 0.0;
//        int positionBigValue = 0;
//
//        for (int i = 0; i < allNumberBig.length; i++) {
//            System.out.print("Digite um numero: ");
//            allNumberBig[i] = sc.nextDouble();
//
//            if (bigValue < allNumberBig[i]) {
//                bigValue = allNumberBig[i];
//                positionBigValue = i;
//            }
//
//        }
//
//        System.out.println(" ");
//        System.out.println("MAIOR VALOR = " + bigValue);
//        System.out.println("POSICAO DO MAIOR VALOR = " + positionBigValue);

        //6.0 soma_vetores
        System.out.println("Maior e sua Posição");
        System.out.println("-----------------------------------------");

        System.out.print("Quantos valores vai ter cada vetor? ");
        int qtdValueInVect = sc.nextInt();
        sc.nextLine();

        int[] A = new int[qtdValueInVect];
        int[] B = new int[qtdValueInVect];
        int[] C = new int[qtdValueInVect];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A - " + (i + 1) + "º: ");
            A[i] = sc.nextInt();
        }

        System.out.println(" ");
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B - " + (i + 1) + "º: ");
            B[i] = sc.nextInt();
        }

        System.out.println(" ");
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }

        sc.close();
    }
}

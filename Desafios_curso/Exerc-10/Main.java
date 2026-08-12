import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // 1.0 Exercicio Problema Negativos
        System.out.println("NEGATIVOS");
        System.out.println("-----------------------------------------");
        System.out.print("Quantos numeros voce vai digitar? ");
        int qtdNegativos = sc.nextInt();
        int[] valueNeg = new int[qtdNegativos];


        int j = 0;
        while (j < valueNeg.length) {
            System.out.print("Digite um numero: ");
            valueNeg[j] = sc.nextInt();
            j++;
        }

        System.out.println(" ");
        System.out.println("NUMEROS NEGATIVOS: ");

        for (int n : valueNeg) {
            if (n < 0) {
                System.out.println(n);
            }
        }

        // 2.0 Soma_Vetor
        System.out.println("NEGATIVOS");
        System.out.println("-----------------------------------------");
        System.out.print("Quantos numeros voce vai digitar? ");
        int qtdSomaVetor = sc.nextInt();
        int[] vectSoma = new int[qtdNegativos];

        for (int i = 0; i < vectSoma.length; i++) {
            System.out.print("Digite um numero: ");
            valueNeg[j] = sc.nextInt();

        }
    }
}

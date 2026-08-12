import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de pessoal: ");
        int qtdPeople = sc.nextInt();

        double average = 0;
        double[] height = new double[qtdPeople];

        for (int i = 0; i < height.length; i++) {
            System.out.print("Altura da " + (i + 1) + "º Pessoa: ");
            height[i] = sc.nextDouble();
            average += height[i];
        }

        System.out.println("AVERAGE HEIGHT = " + String.format("%.2f  %n", average / height.length));
        sc.close();
    }
}

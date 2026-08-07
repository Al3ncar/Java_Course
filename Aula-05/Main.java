import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 5.0 Laços de repetição
        int[] arrNumb = new int[10];
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<String> names = new ArrayList<>();

        names.add("July");
        names.add("Arthur");
        names.add("Bryan");
        names.add("John");
        names.add("Foster");

        System.out.println(names);
        System.out.println(" ");

        // 5.1 Tipos de laços:
        // Temos 3 tipos de laços, sendo eles: For , while e o do-while

        // 1. for classico:

        for (int i = 1; i <= 10; i++) {
            if (i == 1 || i == 2 || i == 3) System.out.println(i + "° Lugar - Parabéns!");
            else System.out.println(i + "° Lugar");
        }
        System.out.println(" ");

        // 1.1 for-each (Usandos geralmente em Array e ArrayList => Iterador):
        System.out.println("Nomes do array:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(" ");

        // 2.0 While:

        int contador = 1;
        while (contador <= 5) {
            if (contador == 5) System.out.println(contador);
            else System.out.print(contador + ", ");

            contador++;
        }

        System.out.println(" ");

        // 3.0 Do-While
        int numero = 1;

        do {
            if (numero % 3 == 0) System.out.println(numero + " Indiozinhos...");
            else if (numero == 10) System.out.println(numero + " No pequeno bote");
            else System.out.println(numero + " ...");
            numero++;
        } while (numero <= 10);
        System.out.println(" ");


    }
}
import entities.Persons;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas empregados seram registrados: ");
        int qtdEmployees = sc.nextInt();
        sc.nextLine();

        Persons[] person = new Persons[qtdEmployees];


        for(int i = 0; i < person.length; i++){
            System.out.println(person[i]);
            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("NAME: ");
            String name = sc.nextLine();

            System.out.print("SALARY: ");
            int id = sc.nextInt();

            sc.nextLine();

        }

        sc.close();
    }
}

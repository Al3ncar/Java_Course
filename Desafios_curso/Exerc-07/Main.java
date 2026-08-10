import entities.Person;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Person person;

        System.out.println("==================================");
        System.out.println("            Formulario            ");
        System.out.println("==================================");
        System.out.println("Bem vindo, Cadastro de Conta... Por favor, informe seus dados ");

        System.out.println(" ");
        System.out.print("Numero da Conta Bancaria: ");
        int initialNumCount = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do Usuario: ");
        String initialName = sc.nextLine();


        System.out.println("Deseja informar o valor do deposito inicial? ");
        System.out.print("[S] Sim ou [N]Não: ");
        char option = sc.next().charAt(0);
        System.out.println(" ");

        if (option == 'S' || option == 's') {
            System.out.print("Por favor, informe o valor: R$");
            double initialPriceDepositor = sc.nextDouble();
            person = new Person(initialNumCount, initialName, initialPriceDepositor);
        } else {
            person = new Person(initialNumCount, initialName);
        }


        System.out.println("Dados da conta: ");
        System.out.println(person);
        System.out.println(" ");


        System.out.print("Valor de Deposito: R$");
        double cacheValue = sc.nextDouble();
        System.out.println("Atualização de Cadastro: ");
        person.depositor(cacheValue);
        System.out.println(person);
        System.out.println(" ");

        System.out.print("Valor de Saque: R$");
        cacheValue = sc.nextDouble();
        System.out.println("Atualização de Cadastro: ");
        person.sacar(cacheValue);
        System.out.println(person);

        sc.close();
    }
}

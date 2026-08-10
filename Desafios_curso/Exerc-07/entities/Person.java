package entities;

public class Person {
    private String name;
    private int holder;
    private double balance;


    public Person(int holder, String name, double initialDeposit) {
        this.name = name;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Person(int holder, String name) {
        this.name = name;
        this.holder = holder;
    }

    public String getName() {
        return name;
    }

    public int getNumCount() {
        return holder;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Dados da conta atual: R$" + balance);
    }

    public void withDrow(double amount) {
        if (balance < 5) {
            System.out.println("AÇÃO INVALIDA, SALDO INSULFICIENTE");
        } else {
            balance -= (amount + 5);
            System.out.println("Dados da conta atual: R$" + balance);
        }
    }

    public String toString() {
        return "Conta Numero " + this.getNumCount()
                + ", " + " Autor da conta: "
                + this.getName() + ", " + "Valor: R$"
                + String.format("%.2f %n", balance);
    }
}

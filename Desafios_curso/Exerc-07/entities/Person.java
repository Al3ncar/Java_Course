package entities;

public class Person {
    private String name;
    private int numCount;
    private double priceDepositor;


    public Person(int numCount, String name, double priceDepositor) {
        this.name = name;
        this.numCount = numCount;
        this.priceDepositor = priceDepositor;
    }

    public Person(int numCount, String name) {
        this.name = name;
        this.numCount = numCount;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumCount() {
        return numCount;
    }

    public void depositor(double value) {
        this.priceDepositor += value;
        System.out.println("Dados da conta atual: R$" + priceDepositor);
    }

    public void sacar(double value) {
        if (this.priceDepositor < 5) {
            System.out.println("AÇÃO INVALIDA, SALDO INSULFICIENTE");
        } else {
            this.priceDepositor -= (value + 5);
            System.out.println("Dados da conta atual: R$" + priceDepositor);
        }
    }

    public String toString() {
        return "Conta Numero " + numCount
                + ", " + " Autor da conta: "
                + name + ", " + "Valor: R$"
                + String.format("%.2f %n", priceDepositor);
    }
}

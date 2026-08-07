public class App {
    public static void main(String[] args) {
        // 6.0 Casting: Conversão de tipos
        // Temos 2 tipos de Casting (Implicito e o Explicito)

        // 1.0 Casting widening (IMPLICITO)
        // 1.1
        int numero = 10;
        double numeroDouble = numero;
        System.out.println(numeroDouble);
        System.out.println(" ");

        // 1.2
        byte b = 10;
        int i = b;
        System.out.println(i);
        System.out.println(" ");

        // 1.3
        int idade = 20;
        long idadeLong = idade;
        System.out.println(idadeLong);
        System.out.println(" ");


        // 1.4
        float salario = 1500.50f;
        double salarioDouble = salario;
        System.out.println(salarioDouble);
        System.out.println(" ");

        // 2.0 Casting narrrowing (EXPLÍCITO)
        // 2.1
        double valor = 10.99;
        int numero2 = (int) valor;
        System.out.println(numero2);
        System.out.println(" ");

        // 2.2
        double valor1 = 999.99;
        int numero3 = (int) valor1;
        System.out.println(numero3);
        System.out.println(" ");

        // 2.3
        // Excedendo o limite do tipo
        long numBig = 5000000000000000000l;
        int numero4 = (int) numBig;
        System.out.println(numero4);
        System.out.println(" ");


        // 2.4
        // Excedendo o limite do tipo
        int numero5 = 200;
        byte pequeno = (byte) numero5;
        System.out.println(pequeno);
        System.out.println(" ");

        // 2.5
        // Codigo UNICODE
        char letra = 'A';
        int code = (int) letra;
        System.out.println(code);
        System.out.println(" ");

        // 2.6
        // Codigo UNICODE
        int code1 = 66;
        char letra1 = (char) code1;
        System.out.println(letra1);
        System.out.println(" ");

        // 2.7
        String textNumb = "123";
        int textNumbConvert = Integer.parseInt(textNumb);
        System.out.println(textNumbConvert);
        System.out.println(" ");

        // 2.8
        int number2 = 12345687;
        String number2TextConvert = Integer.toString(number2);
        System.out.println(number2TextConvert);
        System.out.println(" ");

        // 2.9
        int number3 = 12345687;
        String number3TextConvert = String.valueOf(number3);
        System.out.println(number3TextConvert);
    }
}

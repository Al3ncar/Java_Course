public class Main{
    public static void main(String[] args){
        // 2.0 Aula tipos e de variaveis
            System.out.println(" ");
            byte b = 100;
            short s = 10000;
            int i = 100000000;
            long l = 100000000000000000L;

            float f = 10.5f;
            double d = 10.5433212;

            String str1 = new String("Joãozinho");
            char c = 'A';

            boolean isB = true;

        // 2.1 Mudança de tipos: Podemos converter os nossos tipos usando Wrappers Class

            // Autoboxing:
                int numberInt = 10; // Primitivo
                Integer numberObj = numberInt; // Wrapper

            // Unboxing:
                Integer numbObj = 10; // Wrapper
                int numberInt1 = numberObj; // Primitivo

            // Na sua maioria podemos usar a conversão dessa forma
            // Porem o que realmente acontece simultaneamente, é o seguinte:

                //  Autoboxing: => Integer numberObject = Integer.valueOf(number);
                //  Unboxing: => int number = numberObject.intValue();


        // 3.0 Diferença de Print() para Println()

            // print()
            System.out.println("Olá Mundo!!!");
            System.out.println("Como você está??");
            System.out.println(" ");


            // println()
            System.out.print("Olá Mundo 2");
            System.out.print("Como você está??");
            System.out.println(" ");
            System.out.println(" ");


        // 4.0 Usando o PrintF: Pode ser usado para pontos flutuantes ou em concatenações

            // Formatação
            double x = 10.56789;
            System.out.printf("%.2f%n", x);
            System.out.printf("%.4f%n", x);


            // Concatenar
            String name = "Maria";
            int idade = 22;
            String moraEm = "São Paulo, SP";
            System.out.println(" ");

            System.out.printf("Olá meu nome é %s, eu tenho %d e moro em %s %n", name, idade, moraEm);
    }
}
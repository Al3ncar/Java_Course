public class App {
    public static void main(String[] args) {
        // 8.0 Processamento de dados em Java => CASTING

        float b, h, B, area;

        b = 6f;
        h = 5f;
        B = 8f;

        area = (b + B) / 2f * h;
        System.out.printf("A area é: %.1f %n", area);
        System.out.println(area);
        System.out.println(" ");

        int x, y;
        double resultado;

        x = 5;
        y = 2;

        resultado = x / y;
        System.out.println(resultado); // 2.0

        // O resultado é 2.0, por conta do Java entender que x e y são inteiros
        // Por tanto, ele supõe que eu queira um valor final inteiro, cortando o 0.5

        // inteiro / inteiro
        // resultado inteiro => 2
        // para solucionar esse problema vamos usar a seguinte estrutura:

        resultado = (double) x / y ; // conversão de tipos
        System.out.println(resultado); // 2.5
        System.out.println(" ");

        double valA;
        int valB;

        valA = 5.0;
        valB = (int) valA; // Convertemos o tipo da valB para inteiro

        System.out.println(valB);
    }
}

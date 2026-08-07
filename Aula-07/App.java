import java.util.Locale;

public class App{
    public static void main(String[] args){
        // 7.0 Saída de dados em Java
            // 1.0 Diferença de Print() para Println()
                // print()
                    System.out.println("Olá Mundo!!!");
                    System.out.println("Como você está??");
                    System.out.println(" ");


                // println()
                    System.out.print("Olá Mundo 2");
                    System.out.print("Como você está??");
                    System.out.println(" ");
                    System.out.println(" ");

            // 2.0 Locale: Podemos mudar o padrão e caracteres, mundando o locale

                // Por estarmos no Brasil quando usamos o pontos flutuantes automaticamente
                // ele associa e atribui na conversão a vírgula, exemplo
                    double value = 10.87653;
                    System.out.printf("%.2f%n", value); // 10,88
                    System.out.println(" ");

                // Importação do package Java.util (para usar o Locale)
                    System.out.printf("%.2f%n", value); // 10,88
                    Locale.setDefault(Locale.US); // Depois dessa mudança as vírgulas iram se manter como pontos agora
                    System.out.printf("%.2f%n", value); // 10.88
                    System.out.println(" ");

            // 3.0 Usando o PrintF: Pode ser usado para pontos flutuantes ou em interpolações
                // Formatação
                    double x = 10.56789;
                    System.out.printf("%.2f%n", x);
                    System.out.printf("%.4f%n", x);

                // Interpolação:
                    String name = "Maria";
                    int idade = 22;
                    String moraEm = "São Paulo, SP";
                    System.out.println(" ");

                    System.out.printf("Olá meu nome é %s, eu tenho %d e moro em %s %n", name, idade, moraEm);

                    // Regra base para isso:
                    // - %f = Ponto flutuante
                    // - %d = Inteiro
                    // - %s = Texto
                    // - %n = Quebra de linha

    }
}
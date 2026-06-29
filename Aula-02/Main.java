public class Main {
    public static void main(String[] args) {
        // 2.0 Aulas condições + Métodos
            // equals() e isBlank()
            String str = "Text";
            String strA = "Text2";
            byte b = 100;


            System.out.println(" ");
            if (str.isBlank() || str.equals(strA)) {
                System.out.println("Verdadeiro");
            } else {
                System.out.println("Falso");
            }

            if (str.isBlank()) {
                System.out.println("Verdadeiro");
            } else if (b >= 100) {
                System.out.println("B é maior que 100, Verdadeiro");
            } else {
                System.out.println("Falso");
            }
    }
}

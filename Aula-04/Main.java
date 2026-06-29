import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 4.0 Array List
            System.out.println(" ");
            ArrayList<String> carros = new ArrayList<String>();

            carros.add("Ford");
            carros.add("BWM");
            carros.add("Volvo");

            for (int car = 0; car < carros.size(); car++) {
                System.out.println(car + "° MARCA: " + carros.get(car));
            }

            System.out.println(" ");

            for (String carro : carros) {
                System.out.println(carro);
            }

            System.out.println(" ");
            ArrayList<String> newCars = new ArrayList<String>(carros); // [Ford, BWM, Volvo]

            // .addFirst(): Adiciona valores no começo do ArrayList
                newCars.addFirst("Mazpa");
                System.out.println(newCars); // [--> Mazpa, Ford, BWM, Volvo]

            // .addLast(): Adiciona valores no final do ArrayList
                newCars.addLast("Opel");
                System.out.println(newCars); // [Mazpa, Ford, BWM, Volvo, Opel <--]


            System.out.println(" ");
            for (String car : newCars) {
                System.out.println(car);
            }

            System.out.println(" ");
            ArrayList<Integer> numbers = new ArrayList<>();

            for (int num = 1; num <= 10; num++) {
                numbers.addLast(num);
                System.out.println(numbers.get(num - 1));
            }
    }
}
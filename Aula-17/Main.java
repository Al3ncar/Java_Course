import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Julia");
        names.add("Anna");
        names.add("Abraão");
        names.add("Maria");
        names.add("Amanda");
        names.add("Nico");


        names.add(4, "Arthur");

        List<String> filterNamesList = names.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());


        String firstChar = names.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);


        for (String name : filterNamesList) {
            System.out.println(name);
        }

        System.out.println(firstChar);


//        List<String> names = new ArrayList<>();
//
//        // Adicionando elementos
//        names.add("Amanda");
//        names.add("Maria");
//        names.add("Brendom");
//        names.add("Anna");
//
//        //Adicionando em um elemento especifico
//        names.add(2, "Marco");
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        System.out.println("--------------------------------------");
//
//        //Tamanho dooo array
//        System.out.println(names.size());
//        System.out.println("--------------------------------------");
//
//        //Removendo elementos pelo valor
//        names.remove("Brendom");
//
//        //Removendo pelo indice
//        names.remove(2);
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//        System.out.println("--------------------------------------");
//
//        // Removendo caso seja verdadeiro
//        names.removeIf(x -> x.charAt(0) == 'M');
//
//        // Buscando pelo indice
//        System.out.println("Index of Bob: " + names.indexOf("Julia")); // 1
//        System.out.println("Index of Bob: " + names.indexOf("Marcia")); // -1
//
//        System.out.println("--------------------------------------");
//
//        // Filtrando array
//        List<String> result = names.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
//        result.add("Emilly");
//
//        for (String name : result) {
//            System.out.println(name);
//        }
//
//        System.out.println("--------------------------------------");
//
//
//        String name = names.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse("No exist");
//        System.out.println(name);
//
//        String name2 = names.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse("No exist");
//        System.out.println(name2);
    }
}

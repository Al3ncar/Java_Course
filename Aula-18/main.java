//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.Instant;
//import java.time.format.DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;


public class main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();


        System.out.println("--------------------------");
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("--------------------------");


        LocalDate d04 = LocalDate.parse("2026-09-10");
        LocalDateTime d05 = LocalDateTime.parse("2026-09-10T12:42:50");
        Instant d06 = Instant.parse("2026-09-10T12:42:50Z");
        Instant d07 = Instant.parse("2026-09-10T12:42:50-05:00");

        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("--------------------------");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("10/09/2026", fmt1);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/09/2026 04:34", fmt2);

//        Podemos usar dessa forma também, conectar tudo em uma unica linha
        LocalDate d10 = LocalDate.parse("20/07/2027", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);


        System.out.println("--------------------------");


        // Podemos usar o "of" caso os valores estejam em campos separados

        LocalDateTime d12 = LocalDateTime.of(2026, 9, 23, 17, 30, 29);
        System.out.println("d12 = " + d12);

        System.out.println("--------------------------");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("d13 = " + d04.format(fmt3));
        System.out.println("d14 = " + fmt3.format(d04));
        System.out.println("d15 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));


        System.out.println("d16 = " + d05.format(fmt3));
        System.out.println("d17 = " + d05.format(fmt4));
        System.out.println("--------------------------");

        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d18 = " + d05.format(fmt5));
        System.out.println("--------------------------");
    }
}

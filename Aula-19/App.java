import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2026-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2026-07-20T01:30:26");
        Instant d03 = Instant.parse("2026-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("------------------------------------");
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("------------------------------------");


        System.out.println("d02 DIA = " + d02.getDayOfMonth());
        System.out.println("d02 MES = " + d02.getMonthValue());
        System.out.println("d02 ANO = " + d02.getYear());
        System.out.println(" ");
        System.out.println("d02 HORAS = " + d02.getHour());
        System.out.println("d02 MINUTOS = " + d02.getMinute());
        System.out.println("d02 SEGUNDOS = " + d02.getSecond());


    }
}

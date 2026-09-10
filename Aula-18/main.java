import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;

public class main {
    public static void main(String[] args){
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
    }
}

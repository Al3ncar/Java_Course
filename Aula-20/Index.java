import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class Index {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        String dataFormatted = d02.format(fmt1);


        Instant instant = Instant.now();
        LocalDateTime brasilDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        String braFormatted = brasilDate.format(fmt1);
        System.out.println(brasilDate);
        System.out.println(braFormatted);

        LocalDate r1 = d01.plusDays(7);
        LocalDate r2 = d01.minusDays(7);

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);

        LocalDateTime r3 = d02.minusHours(8);
        LocalDateTime r4 = d02.minusMinutes(10);

        LocalDateTime r5 = d02.plusHours(8);
        LocalDateTime r6 = d02.plusMinutes(10);


        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println("MINUS ");
        System.out.println("---------------------------");
        System.out.println("DATE: " + dataFormatted);
        System.out.println("- Antes: " + r3.format(fmt1));
        System.out.println("- Antes: " + r4.format(fmt1));

        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println("PLUS ");
        System.out.println("---------------------------");
        System.out.println("DATE: " + dataFormatted);
        System.out.println("- Depois: " + r5.format(fmt1));
        System.out.println("- Depois: " + r6.format(fmt1));


        Instant d12 = Instant.parse("2026-09-30T04:20:12Z");
        Instant pastD12 = d12.minus(7, ChronoUnit.DAYS);
        Instant nextD12 = d12.plus(10, ChronoUnit.DAYS);

        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println("INSTANT MINUS AND PLUS ");
        System.out.println("------------------------------");
        System.out.println("pastD12: " + pastD12);
        System.out.println("nextD12: " + nextD12);

        LocalDateTime r9 = d02.minusDays(10);

        Duration t1 = Duration.between(pastD12, d12);
        Duration t2 = Duration.between(r9, d02);
        Duration t3 = Duration.between(r1.atTime(0, 0), d01.atTime(0, 0));
        Duration t4 = Duration.between(r2.atStartOfDay(), d01.atStartOfDay());
        Duration t5 = Duration.between(nextD12, d12);

        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println("DURATION ");
        System.out.println("------------------------------");
        System.out.println("Duration t1: " + t1.toDays());
        System.out.println("Duration t2: " + t2.toDays());
        System.out.println("Duration t3: " + t3.toDays());
        System.out.println("Duration t4: " + t4.toDays());
        System.out.println("Duration t5: " + t5.toDays());

    }
}
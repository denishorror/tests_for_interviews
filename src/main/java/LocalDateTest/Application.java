package LocalDateTest;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Application {
    public static void main(String[] args) {
        LocalDate localDate2 = LocalDate.parse("2019-12-31");
        LocalDate localDate1 = LocalDate.parse("2020-11-01");

        long days = ChronoUnit.DAYS.between(localDate1, localDate2);
        long months = (long) (days / 31.9);
        System.out.println(days);
        System.out.println(months);
    }
}

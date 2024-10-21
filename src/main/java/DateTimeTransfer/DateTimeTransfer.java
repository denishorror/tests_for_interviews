package DateTimeTransfer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeTransfer {
    public static void main(String[] args) {
        String startDateString = "08.12.2017";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(LocalDate.parse(startDateString, formatter).format(formatter2));
    }
}

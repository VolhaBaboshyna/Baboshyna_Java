package by.homework.lessons.Task20;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTask {

    public static void main(String[] args) {
     //1
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(localDate.format(dateTimeFormatter));

        //2
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd MMMM yyyy', 'hh:mm:ss a");
        System.out.println(localDateTime.format(dateTimeFormatter1));
    }
}

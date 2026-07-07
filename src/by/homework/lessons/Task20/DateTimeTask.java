package by.homework.lessons.Task20;

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

        //3
        String time = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a");
        System.out.println(LocalDateTime.parse(time, dateTimeFormatter2));

        //4
        String time1 = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("eee dd.MM.yy' г. время: 'HH:mm:ss");
        System.out.println(LocalDateTime.parse(time1, dateTimeFormatter3));

        //5
        LocalDateTime localDateTime1 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("eeee dd MMMM yyyy' время: 'HH.mm.ss a");
        System.out.println(localDateTime1.format(dateTimeFormatter4));
    }
}

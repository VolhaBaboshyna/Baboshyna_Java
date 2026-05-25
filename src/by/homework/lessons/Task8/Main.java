package by.homework.lessons.Task8;

import java.lang.String;

public class Main {
    public static void main(String[] args) {

        // Задание 1.3
        StringClass myObject = new StringClass();

        String result1 = myObject.stroka1("Первая часть предложения", " и вторая часть предложения");
        System.out.println(result1);

        String result2 = myObject.stroka2("Первая часть предложения", "предложения");
        System.out.println(result2);

        //Задание 2.1
        StringClass myObject1 = new StringClass();
        myObject1.StringJoin(6, "jjjjj");

        //Задание 3.1
        StringClass myObject2 = new StringClass();
        myObject2.deleteNotLetterSymbols();

    }

}

package by.homework.lessons.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        System.out.println("Task 1");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 | i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
         */

        /*
        System.out.println("Task 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число a");
        int a = sc.nextInt();
        System.out.println("Введите положительное число b");
        int b = sc.nextInt();
        int sum = 0;
        while (a <= b) {
            sum = sum + a;
            a++;
        }
        System.out.println("Сумма равна: " + sum);
        */
/*
        System.out.println("Task 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое не заканчивается на 0");
        int a = sc.nextInt();
        int b, i=0;
        double avg;
        if (a%10!=0) {
            while (a != 0) {
                b = a % 10;
                System.out.print(b);
                i++;
                a = a / 10;
            }
        }  else {
            System.out.println("Вы ввели число, которое заканчиватеся на 0");
        }
 */
/*
        System.out.println("Task 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое не заканчивается на 0");
        int a = sc.nextInt();
        int b, i = 0;
        String chetnie = "", nechetnie = "";
        if (a % 10 != 0) {
            while (a != 0) {
                b = a % 10;
                if (b % 2 == 0) {
                    chetnie = chetnie + b + "  ";
                } else {
                    nechetnie = nechetnie + b + "  ";
                }

                i++;
                a = a / 10;
            }
        } else {
            System.out.println("Вы ввели число, которое заканчиватеся на 0");
        }
        System.out.println("Четные: " + chetnie);
        System.out.println("Нечетные: " + nechetnie);
         */


    }
}

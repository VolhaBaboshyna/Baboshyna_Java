package by.homework.lessons.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        System.out.println("Task 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        System.out.println("Введите c");
        int c = sc.nextInt();
        if (a % 2 == 0) {
            System.out.print(a + " ");
        }
        if (b % 2 == 0) {
            System.out.print(b + " ");
        }
        if (c % 2 == 0) {
            System.out.print(c);
        }
         */

        /*
        System.out.println("Task 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        System.out.println("Введите c");
        int c = sc.nextInt();
        if (a % 2 == 0|a % 5 == 0) {
            System.out.print(a + " ");
        }
        if (b % 2 == 0|b % 5 == 0) {
            System.out.print(b + " ");
        }
        if (c % 2 == 0|c% 5 == 0) {
            System.out.print(c);
        }
        */

        System.out.println("Task 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        double result = 15.0 / x;
        if (result == (int) result) {
        switch ((int) result) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
        }
        } else {
            System.out.println("Результат деления равен дробному числу " + result);
        }
    }
}

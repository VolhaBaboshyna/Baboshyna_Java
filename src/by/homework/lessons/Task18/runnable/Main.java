package by.homework.lessons.Task18.runnable;

import by.homework.lessons.Task18.runnable.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Kia", "1234QQ", 1200);
        Thread car1Thread = new Thread(car1);
        Car car2 = new Car("Lada", "1234PP", 700);
        Thread car2Thread = new Thread(car2);

        car1Thread.start();
        car2Thread.start();


//        Car car3 = new Car("Geely", "1234II", 900);
//        Thread car3Thread = new Thread(car3);

    }


}

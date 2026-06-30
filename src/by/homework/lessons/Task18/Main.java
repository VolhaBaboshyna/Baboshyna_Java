package by.homework.lessons.Task18;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car car1 = new Car("Kia", "1234QQ", 1200);
        Car car2 = new Car("Lada", "1234PP", 700);
        //Задание 1-2
        car1.start();
        car2.start();

        //Задание 3
//        Car car3 = new Car("Geely", "1234II", 900);
//        car1.start();
//        car1.join();
//        car2.start();
//        car3.start();

    }
}

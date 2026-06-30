package by.homework.lessons.Task18;

public class Car extends Thread {
    private String name;
    private String number;
    private int parkTime;

    public Car(String name, String number, int parkTime) {
        this.name = name;
        this.number = number;
        this.parkTime = parkTime;
    }
// Задание 2
//    public void run() {
//        try {
//            for (int i = 0; i < 20; i++) {
//                System.out.println("Машина " + name + " едет");
//                Thread.sleep(this.parkTime);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }
    //Задание 1
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println("Машина " + name + " едет");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }


}

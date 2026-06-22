package by.homework.lessons.Task17;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ауди", 250, "Германия");
        serialize(car1, new File("src/by/homework/lessons/Task17/Task17-2.txt"));
        System.out.println(deserialize("src/by/homework/lessons/Task17/Task17-2.txt"));

    }

    private static void serialize(Car car, File file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(car);
        } catch (Exception e) {
            throw new RuntimeException("Error");
        }
    }

    private static Car deserialize(String file) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Car carResult = (Car) objectInputStream.readObject();
            return carResult;
        } catch (Exception e) {
            throw new RuntimeException("Error");
        }

    }

}

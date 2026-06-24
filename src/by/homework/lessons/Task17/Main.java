package by.homework.lessons.Task17;

import java.io.File;

import static by.homework.lessons.Task17.Car.deserialize;
import static by.homework.lessons.Task17.Car.serialize;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ауди", 250, "Германия");
        serialize(car1, new File("src/by/homework/lessons/Task17/Task17-2.txt"));
//        System.out.println(deserialize("src/by/homework/lessons/Task17/Task17-2.txt"));

    }
}

package by.homework.lessons.Task17;

import java.io.*;
import java.util.Objects;

public class Car implements Serializable {
    private String mark;
    private int maxSpeed;
    private String countryProduction;

    public Car(String mark, int maxSpeed, String countryProduction) {
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.countryProduction = countryProduction;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public void setCountryProduction(String countryProduction) {
        this.countryProduction = countryProduction;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(mark, car.mark) && Objects.equals(countryProduction, car.countryProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, maxSpeed, countryProduction);
    }

    public String toString() {
        return "Марка: " + this.mark + " , Максимальная скорость: " + this.maxSpeed + ", Страна производитель: " + this.countryProduction;
    }

    public static void serialize(Car car, File file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(car);
        } catch (Exception e) {
            throw new RuntimeException("Error");
        }
    }

    public static Car deserialize(String file) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Car carResult = (Car) objectInputStream.readObject();
            return carResult;
        } catch (Exception e) {
            throw new RuntimeException("Error");
        }

    }
}

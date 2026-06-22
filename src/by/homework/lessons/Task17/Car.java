package by.homework.lessons.Task17;

import java.io.Serializable;
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
}

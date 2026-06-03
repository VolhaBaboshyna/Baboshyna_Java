package by.homework.lessons.Task12;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car("Тягач Мэтр", 137);
        Garage<Car> carGarage1 = new Garage<>(car1);
        Motorcycle motorcycle1=new Motorcycle("Мотоцикл Молния", 99);
        Garage<Motorcycle> carGarage2 = new Garage<>(motorcycle1);
        Garage<Car> carGarage3 = new Garage<>("Машина Салли", 109);
        System.out.println("Допуск в гараж:");
        System.out.println(carGarage1.entryPermition(carGarage1.isEntryPermitted()));
        System.out.println(carGarage2.entryPermition(carGarage2.isEntryPermitted()));
        System.out.println(carGarage3.entryPermition(carGarage3.isEntryPermitted()));

    }
}

package by.homework.lessons.Task11;

public interface Robot {

    default void repair() {
            System.out.println("Робот отремонтирован");
    }

    ;

    abstract void turnOn();

    abstract void turnOff();

    abstract String uniquePossibility();

}

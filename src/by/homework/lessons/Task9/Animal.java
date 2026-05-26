package by.homework.lessons.Task9;

public class Animal {
    private String color;
    private int maximumLifespan;
    private String foodType;

    public Animal(String color, int maximumLifespan, String foodType) {
        this.color = color;
        this.maximumLifespan = maximumLifespan;
        this.foodType = foodType;
    }

    public Animal() {
    }


    public void Sound() {

    }

    public void Sound(String animal) {
        String result = animal + " поет";
        System.out.println(result);
    }

    public void Play(String animal) {
        String result = animal + " играет";
        System.out.println(result);
    }

    public void Play() {
    }

    public String toString() {
        String result = "Цвет: " + color + ", Максимальная продолжительность жизни: " + maximumLifespan + "лет, Тип еды: " + foodType;
        return result;
    }

}

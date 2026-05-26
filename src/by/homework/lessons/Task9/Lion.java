package by.homework.lessons.Task9;

public class Lion extends Animal {
    private String name;
    private int age;

    public Lion(String color, int maximumLifespan, String foodType, String name, int age) {
        super(color, maximumLifespan, foodType);
        this.name = name;
        this.age = age;
    }

    public void Sound() {
        String result = "Лев " + name + " рычит";
        System.out.println(result);
    }

    public void Play() {
        String result = "Лев " + name + " играет с жертвой";
        System.out.println(result);
    }

    @Override
    public String toString() {
        String result = "Лев: " + name + ", Возраст: " + age + " лет";
        return result;
    }


}

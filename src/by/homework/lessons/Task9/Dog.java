package by.homework.lessons.Task9;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double averageWeight;

    public Dog(String color, int maximumLifespan, String foodType) {
        super(color, maximumLifespan, foodType);
    }

    public Dog(String color, int maximumLifespan, String foodType,String name, String breed, double averageWeight) {
        super(color, maximumLifespan, foodType);
        this.name=name;
        this.breed=breed;
        this.averageWeight=averageWeight;
    }

    public Dog() {
        super();
    }

    public void Bark(String name) {
        String result = name + " лает";
        System.out.println(result);
    }

    public void Bite(String name) {
        String result = name + " кусает";
        System.out.println(result);
    }

    public void Run(String name) {
        String result = name + " бегает";
        System.out.println(result);
    }

    public void Jump(String name) {
        String result = name + " прыгает";
        System.out.println(result);
    }

    public void Sound(String animal) {
        String result = animal + " лает";
        System.out.println(result);
    }

    public void Play(String animal) {
        String result = animal + " играет с палкой";
        System.out.println(result);

    }

    public void toString(String color, int maximumLifespan, String foodType, String name, String breed, double averageWeight) {
        String result = "Цвет: " + color + ", Максимальная продолжительность жизни: " + maximumLifespan + " лет, Тип еды: " + foodType +
                ", Имя: " + name + ", Порода: " + breed + ", Средний вес: " + averageWeight + " кг";
        System.out.println(result);
    }


}

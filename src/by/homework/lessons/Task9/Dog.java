package by.homework.lessons.Task9;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double averageWeight;

    public Dog(String color, int maximumLifespan, String foodType) {
        super(color, maximumLifespan, foodType);
    }

    public Dog(String color, int maximumLifespan, String foodType, String name, String breed, double averageWeight) {
        super(color, maximumLifespan, foodType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public Dog() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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

    public void Sound() {
        String result = name + " лает";
        System.out.println(result);
    }

    public void Play() {
        String result = name + " играет с палкой";
        System.out.println(result);

    }

    public String toString() {
        String result = "Собака. Id: " + id + " Цвет: " + color + ", Максимальная продолжительность жизни: " + maximumLifespan + " лет, Тип еды: " + foodType +
                ", Имя: " + name + ", Порода: " + breed + ", Средний вес: " + averageWeight + " кг";
        return result;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        if (name.equals(dog.getName()) && breed.equals(dog.getBreed()) && averageWeight == dog.getAverageWeight()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = name.hashCode() + breed.hashCode() + (int) averageWeight*100;
        return result;
    }
}

package by.homework.lessons.Task9;

public class Dog extends Animals {
    private String name;
    private String breed;
    private double averageWeight;

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
        String result = animal + " играет с игрушками";
        System.out.println(result);

    }
}

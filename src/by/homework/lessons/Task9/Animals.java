package by.homework.lessons.Task9;

public class Animals {
    private String color;
    private int maximumLifespan;
    private String foodType;

    public void Sound(String animal) {
        String result = animal + " поет";
        System.out.println(result);
    }

    public void Play(String animal) {
        String result = animal + " играет";
        System.out.println(result);
    }

}

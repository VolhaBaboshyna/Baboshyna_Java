package by.homework.lessons.Task9;

public class Lion extends Animal {
    private String name;
    private int age;

    public Lion(String name, int age) {
    }

    public void Sound() {
        String result = "Лев " + name + " рычит";
        System.out.println(result);
    }

    public void Play() {
        String result = "Лев " + name + " играет с жертвой";
        System.out.println(result);
    }


}

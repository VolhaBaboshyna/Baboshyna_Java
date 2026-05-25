package by.homework.lessons.Task9;

public class Bird extends Animal {
    private String family;
    private String maximumFlightAltitude;

    public Bird(String color, int maximumLifespan, String foodType, String family, String maximumFlightAltitude) {
        super(color, maximumLifespan, foodType);
        this.family = family;
        this.maximumFlightAltitude = maximumFlightAltitude;
    }

    public Bird(String color, int maximumLifespan, String foodType) {
        super(color, maximumLifespan, foodType);
    }

    public Bird() {
        super();
    }

    public void Singing(String bird) {
        String result = bird + " поет";
        System.out.println(result);
    }

    public void Sound(String animal) {
        String result = animal + " щебечет";
        System.out.println(result);
    }

    public void Play(String animal) {
        String result = animal + " собирает камни";
        System.out.println(result);

    }

    public String toString(String color, int maximumLifespan, String foodType, String family, String maximumFlightAltitude) {
        String result = "Цвет: " + color + ", Максимальная продолжительность жизни: " + maximumLifespan + ", Тип еды: " + foodType +
                ", Семейство: " + family + ", Максимальная высота полёта: " + maximumFlightAltitude;
        return result;
    }

}

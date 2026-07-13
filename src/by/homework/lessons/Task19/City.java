package by.homework.lessons.Task19;

public class City {
    private int id;
    private String name;
    private int population;
    private String continent;

    public City(int id, String name, int population, String continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String toString() {
        return "id: " + id + ", Имя города: " + name + " , Население:" + population + ", Континент: " + continent;
    }


}

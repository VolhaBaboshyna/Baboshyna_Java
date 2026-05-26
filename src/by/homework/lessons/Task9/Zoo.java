package by.homework.lessons.Task9;

public class Zoo {
    private Animal[] animals;

    public Zoo() {
        this.animals = new Animal[0];
    }

    public void addAnimals(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length + 1];

        for (int i = 0; i < animals.length; i++) {
            newAnimals[i] = animals[i];
        }
        newAnimals[animals.length] = animal;
        animals = newAnimals;
    }

    public void getPrintAnimals() {
        System.out.println("Животные в зоопарке:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void getPrintAnimals(Animal animal) {
        System.out.println(animal);

    }

    public Animal[] getAnimals() {
        return animals;
    }

    public Animal[] setId () {
        super(id);
        for (int i = 0; i < animals.length; i++) {
            animals[i].id=i+1;
        }
        return animals;
    }

}

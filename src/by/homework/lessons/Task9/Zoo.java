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
            if (animal == null) {
            } else {
                System.out.println(animal.toString());
            }
        }
    }

//    public void getPrintAnimals(Animal animal) {
//        System.out.println(animal);
//
//    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setId() {
        for (int i = 0; i < animals.length; i++) {
            animals[i].id = i + 1;
        }
    }

    public void deleteAnimal(int id) {
        Animal[] newAnimals = new Animal[animals.length - 1];
        for (int i = 0, j = 0; i < animals.length; i++) {
            if (id == i + 1) {
            } else {
                newAnimals[j] = animals[i];
                j++;
            }
        }
        animals = newAnimals;
    }
}
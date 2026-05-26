package by.homework.lessons.Task9;

public class Main {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        animal1.Play("Животное");
//
//        Dog dog1 = new Dog();
//        dog1.Sound("Чихуахуа");
//        dog1.Play("Рекс");
//        dog1.Bark("Пекс");
//        dog1.Bite("Фекс");
//        dog1.Run("Тирекс");
//        dog1.Jump("Долматинец");
//        dog1.toString("Серый", 36, "Мясо", "Барбос", "Французский бульдог", 15.4);


        Bird bird1 = new Bird("Коричневый", 12, "Насекомые");
        bird1.Singing("Соловей");
        bird1.Sound("Воробей");
        bird1.Play("Ворона");
        System.out.println(bird1.toString());
        Bird bird2 = new Bird("Коричневый", 12, "Насекомые", "Трубконосые", "1000");
        System.out.println(bird2.toString());

        Zoo zoo1 = new Zoo();
        Bird eagle = new Bird("коричневый", 20, "Мясо", "Ястребиные", "8000 м");

        Bird sparrow = new Bird("Серый", 3, "Зерно", "Воробьиные", "50 м");

        Bird penguin = new Bird("Чёрный", 25, "Рыба", "Пингвиновые", "не летает");
        Dog bobby = new Dog("Рыжий", 12, "Сухой корм", "Бобби",
                "лабрадор", 30.5);

        Dog alice = new Dog("Белый", 15, "Натуральная пища", "Алиса",
                "шпиц", 5.2);

        Dog max = new Dog("Чёрный", 10, "Корм премиум-класса", "Макс",
                "Немецкая овчарка", 40.0);
        zoo1.addAnimals(eagle);
        zoo1.addAnimals(sparrow);
        zoo1.addAnimals(penguin);
        zoo1.addAnimals(bobby);
        zoo1.addAnimals(alice);
        zoo1.addAnimals(max);

//        zoo1.getPrintAnimals();

//        for (Animal animal : zoo1.getAnimals()) {
//            animal.Sound();
//        }
//
//        for (Animal animal : zoo1.getAnimals()) {
//            animal.Play();
//        }

        Lion king = new Lion("Золотистый", 25, "мясо", "Король", 11);
        Lion julion = new Lion("Золотистый", 25, "мясо", "Джулиан", 6);
        Lion simba = new Lion("Коричневый", 25, "фарш", "Симба", 2);
        zoo1.addAnimals(king);
        zoo1.addAnimals(julion);
        zoo1.addAnimals(simba);

        System.out.println(king.toString());
        System.out.println(julion.toString());

        for (Animal animal : zoo1.getAnimals()) {
            animal.Sound();
        }

        for (Animal animal : zoo1.getAnimals()) {
            animal.Play();
        }

        zoo1.setId();

        zoo1.getPrintAnimals();
    }
}
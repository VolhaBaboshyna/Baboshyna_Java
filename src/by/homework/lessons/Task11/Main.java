package by.homework.lessons.Task11;

public class Main {
    public static void main(String[] args) {
        RobotBuilder robotBuilder1 = new RobotBuilder("СС123", 111, "Беларусь",
                "111", "Бронеметалл", false);
        RobotCook robotCook1 = new RobotCook("ПП123", 50, "Литва", "Лопатка", false);
        RobotSapper robotSapper1 = new RobotSapper("ББ123", 32, 2, "Платина", false);
        RobotBuilder robotBuilder2 = new RobotBuilder("СС124", 131, "Беларусь",
                "1112", "Бронеметаллопрофиль", false);
        RobotSapper robotSapper2 = new RobotSapper("ББ124", 32, 3, "Жестянка", false);
        RobotSapper robotSapper3 = new RobotSapper("ББ125", 30, 4, "Чугун", false);
        System.out.println("Ремонт роботов:");
        robotBuilder1.repair();
        robotCook1.repair();
        robotSapper1.repair();


        Robot[] allRobotsExhibition = {robotBuilder1, robotCook1, robotSapper1};
        RobotEngineer[] robotEngineersExhibition = {robotBuilder1, robotSapper1, robotBuilder2};
        RobotSapper[] robotSappersExhibition = {robotSapper1, robotSapper2, robotSapper3};

        System.out.println("Выставка №1");
        for (Robot robot : allRobotsExhibition) {
            System.out.println(robot.uniquePossibility());
        }

        for (Robot robot : allRobotsExhibition) {
            if (robot instanceof RobotEngineer) {
                System.out.println(((RobotEngineer) robot).createItem());
            }
        }


        System.out.println("Выставка №2");
        for (Robot robot : robotEngineersExhibition) {
            System.out.println(robot.uniquePossibility());
        }
        for (Robot robot : robotEngineersExhibition) {
            if (robot instanceof RobotEngineer) {
                System.out.println(((RobotEngineer) robot).createItem());
            }
        }


        System.out.println("Выставка №3");
        for (Robot robot : robotSappersExhibition) {
            System.out.println(robot.uniquePossibility());
        }
        for (Robot robot : robotSappersExhibition) {
            if (robot instanceof RobotEngineer) {
                System.out.println(((RobotEngineer) robot).createItem());
            }
        }

    }
}

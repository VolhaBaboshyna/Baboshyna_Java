package by.homework.lessons.Task19;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String srtToModify = "Hello";
        String resultToUpper = modify(str -> str.toUpperCase(), srtToModify);
        System.out.println(resultToUpper);

        System.out.print("Введите континент: ");
        String continent = scanner.nextLine();

        City minsk = new City(1, "Minsk", 20546, "Europe");
        City gomel = new City(2, "Gomel", 7896, "Europe");
        City moscow = new City(3, "Moskow", 50278, "Europe");
        City pekin = new City(4, "Pekin", 1000000, "Asia");
        City deli = new City(5, "Deli", 2000000, "Asia");

        List<City> cityList = List.of(minsk, gomel, moscow, pekin, deli);

        List<City> cityListEurope = cityList.stream().filter(city -> {
            if (city.getContinent().equals("Europe")) {
                return true;
            }
            return false;
        }).toList();

        List<City> cityListMaxPop = cityListEurope.stream().max((city1, city2) -> {

        }


    }

    ;

    private static String modify(ToUpper toUpper, String value) {
        return toUpper.modify(value);
    }
}

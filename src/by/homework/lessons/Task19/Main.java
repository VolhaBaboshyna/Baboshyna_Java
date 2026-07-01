package by.homework.lessons.Task19;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String srtToModify = "Hello";
        String resultToUpper = modify(str -> str.toUpperCase(), srtToModify);
        System.out.println(resultToUpper);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите континент");
//        String continent = sc.nextLine();

        City minsk = new City(1, "Minsk", 20546, "Europe");
        City gomel = new City(2, "Gomel", 7896, "Europe");
        City moscow = new City(3, "Moskow", 50278, "Europe");
        City pekin = new City(4, "Pekin", 1000000, "Asia");
        City deli = new City(5, "Deli", 2000000, "Asia");

        List<City> cityList = List.of(minsk, gomel, moscow, pekin, deli);

//        List<City> cityListContinent = cityList.stream().filter(city -> {
//            if (city.getContinent().equals(continent)) {
//                return true;
//            }
//            return false;
//        }).toList();
//        System.out.println("Города выбранного континента " + continent);
//        System.out.println(cityListContinent);

//        Optional<City> cityListContMaxPop = cityListContinent.stream().max((city1, city2) ->
//                Integer.compare(city1.getPopulation(), city2.getPopulation()));
//
//        Optional<City> cityListContMinPop = cityListContinent.stream().min((city1, city2) ->
//                Integer.compare(city1.getPopulation(), city2.getPopulation()));


        Optional<City> cityListMaxPop = cityList.stream().max((city1, city2) ->
                Integer.compare(city1.getPopulation(), city2.getPopulation()));

        Optional<City> cityListMinPop = cityList.stream().min((city1, city2) ->
                Integer.compare(city1.getPopulation(), city2.getPopulation()));

//        System.out.println("Город с максимальным населением на континенте " + continent);
//        System.out.println(cityListContMaxPop);
//
//        System.out.println("Город с минимальным населением на континенте " + continent);
//        System.out.println(cityListContMinPop);
//
//        System.out.println("Город с максимальным населением");
//        System.out.println(cityListMaxPop);
//
//        System.out.println("Город с минимальным населением");
//        System.out.println(cityListMinPop);


        System.out.println("Первый город с населением больше миллиона");
        Optional<City> cityFirstMoreMillion = cityList.stream().filter(city -> city.getPopulation() > 1000000).findFirst();
        System.out.println(cityFirstMoreMillion);

        System.out.println("Города с населением больше миллиона");
        List<City> cityMoreMillion = cityList.stream()
                .filter(city -> city.getPopulation() >= 1000000)
                .toList();
        System.out.print(cityMoreMillion);

        Collection<String> cityNames = cityList.stream().map(city -> {
            String cityName = city.getName();
            return cityName;
        }).toList();

        System.out.println("Названия всех городов");
        System.out.println(cityNames);
    }

    private static String modify(ToUpper toUpper, String value) {
        return toUpper.modify(value);
    }
}

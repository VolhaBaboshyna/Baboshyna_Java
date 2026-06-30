package by.homework.lessons.Task19;

public class Main {
    public static void main(String[] args) {
        String resultToUpper = modify(str -> str.toUpperCase(), "hello");
        System.out.println(resultToUpper);
    };


    private static String modify(ToUpper toUpper, String value) {
        return toUpper.modify(value);
    }
}

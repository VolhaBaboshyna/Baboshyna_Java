package by.homework.lessons.Task17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile {
    public static String readTextFromFile(String path) {
        try (FileReader fileReader = new FileReader(path)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String txt = bufferedReader.readLine();
            return txt;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Не найден файл");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

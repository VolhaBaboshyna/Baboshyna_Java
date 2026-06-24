package by.homework.lessons.Task17;

import javax.imageio.IIOException;
import java.io.*;

public class AddTextToFile {
    public static void addTextToFile2(String text) {
        File file = new File("D:/Оля/java/Task17.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(text);
        } catch (IOException e) {
            throw new RuntimeException("Не найден файл");
        }
    }



    public static void addTextToFile1(String text) {
        File file = new File("src/by/homework/lessons/Task17", "Task17.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(text);

        } catch (IIOException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException("Не найден файл");
        }
    }

}

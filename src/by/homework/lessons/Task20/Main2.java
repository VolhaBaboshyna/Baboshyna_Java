package by.homework.lessons.Task20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

public class Main2 implements Callable<List<String>> {

    private static final String path = "src/by/homework/lessons/Task20/files";

    private final int taskId;
    private final Path directory;

    public Main2(int id) {
        this.taskId = id;
        this.directory = Paths.get(path);

        try {
            Files.createDirectories(directory);
        } catch (IOException e) {
            System.err.println("Не удалось создать путь для задачи " + taskId + ": " + e.getMessage());
        }
    }

    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> createdFiles = new ArrayList<>();

        System.out.println("[" + threadName + "] -> Задача " + taskId + " начала работу. Начинаю генерировать 10 файлов.");

        for (int i = 0; i < 10; i++) {
            String fileName = "Task-" + taskId + "_" + UUID.randomUUID().toString().substring(0, 3) + ".txt";
            Path filePath = directory.resolve(fileName);
            List<String> content = new ArrayList<>();
            for (int lineNum = 1; lineNum <= 10; lineNum++) {
                content.add("Line " + lineNum + " | Task:" + taskId + " | Thread:" + threadName);
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
                for (String line : content) {
                    writer.write(line);
                    writer.newLine();
                }
                createdFiles.add(filePath.toString());
            } catch (IOException e) {
                System.out.println(threadName + " Ошибка записи файла " + fileName + ": " + e.getMessage());
            }
        }

        System.out.println(threadName + " Задача " + taskId + " создала " + createdFiles.size() + " файлов. Засыпаю на 1-3 сек...");

        long sleepTimeMs = 1000 + ThreadLocalRandom.current().nextInt(2000);
        Thread.sleep(sleepTimeMs);

        System.out.println(threadName + " Задача #" + taskId + " снова выполняется. Работа завершена.");

        return createdFiles;
    }

    public static void main(String[] args) {
        int tasks = 10;
        int size = 3;

        ExecutorService executor = Executors.newFixedThreadPool(size);
        List<Future<List<String>>> futures = new ArrayList<>();

        System.out.println("Старт работы");
        System.out.println("Всего задач: " + tasks);
        System.out.println("Потоков: " + size);
        System.out.println("Путь: " + Paths.get(path).toAbsolutePath());
        System.out.println("**********************************");

        for (int i = 0; i < tasks; i++) {
            Callable<List<String>> task = new Main2(i);
            Future<List<String>> future = executor.submit(task);
            futures.add(future);
        }

        List<String> allCreatedFiles = new ArrayList<>();

        for (Future<List<String>> future : futures) {
            try {
                List<String> result = future.get();
                allCreatedFiles.addAll(result);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        executor.shutdown();

        System.out.println("**********************************");
        System.out.println("Все задачи закончили выполнение");
        System.out.println("Всего создано файлов: " + allCreatedFiles.size());

        if (!allCreatedFiles.isEmpty()) {
            System.out.println("Созданные файлы:");
            allCreatedFiles.forEach(System.out::println);
        }
    }
}
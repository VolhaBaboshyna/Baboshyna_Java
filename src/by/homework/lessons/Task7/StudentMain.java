package by.homework.lessons.Task7;

import java.awt.event.WindowFocusListener;


public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
//        student1.info();
//        Student student2 = new Student();
//        System.out.println("Данные студента до изменений:");
//        student2.info(2, "Иванна", "Иванова", "Филологический", 3, "П666", 7);
//        student2.groupChange("Р777");
//        System.out.println("Данные студента после изменений:");
//        student2.info();
//        student2.getGroup();
//        student1.groupAndMarkChange("Ш08й", 3);
//        student1.info();


        //Задание 6
        Student[] students = new Student[5];

        students[0] = new Student(1, "Иван", "Иванов", "Информатика", 1, "И-101", 4);
        students[1] = new Student(2, "Иванна", "Иванова", "Филологический", 3, "П666", 7);
        students[2] = new Student(3, "Петр", "Петров", "Информатика", 2, "И-202", 3);
        students[3] = new Student(4, "Анна", "Сидорова", "Экономический", 4, "Э-401", 8);
        students[4] = new Student(5, "Борис", "Павлов", "Филологический", 3, "П666", 5);

        //Задание 8
        Student[] studentHighMark = students[0].getStudents(students, 5);
        if (studentHighMark.length > 0) {
            for (Student student : studentHighMark) {
                student.info();
            }
        }
    }
}








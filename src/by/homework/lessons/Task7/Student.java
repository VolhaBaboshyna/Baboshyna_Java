package by.homework.lessons.Task7;

public class Student {
    int id, course, avg_mark;
    String name, surname, faculty, group;


    //Задание 1. Конструктор без параметров
//    public Student() {
//        System.out.println("Конструктор вызвался");
//    }

    //Задание 1. Конструктор c параметрами
    public Student() {
        id = 1;
        name = "Иван";
        surname = "Иванов";
        faculty = "Экономический";
        course = 3;
        group = "A311";
        avg_mark = 8;
    }


    //    Задание 2
    public void info(int id, String name, String surname, String faculty, int course, String group, int avg_mark) {
        this.id = id;
        this.name = name;
        this.surname = name;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.avg_mark = avg_mark;
        System.out.println("ID: " + id);
        System.out.println("Имя и Фамилия: " + name + " " + surname);
        System.out.println("Факультет, курс и группа: " + faculty + " факультет, " + group + " группа, " + course + " курс");
        System.out.println("Cредняя оценка: " + avg_mark);
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Имя и Фамилия: " + name + " " + surname);
        System.out.println("Факультет, курс и группа: " + faculty + " факультет, " + group + " группа, " + course + " курс");
        System.out.println("Cредняя оценка: " + avg_mark);
    }

    //    Задание 3
    public void groupChange(String group) {
        this.group = group;
        System.out.println("Группа студента изменена на: " + group);
    }

    //          Задание 4
    public String getGroup() {
        System.out.println("Группа студента: " + group);
        return this.group;
    }

    //        Задание 5
    public void groupAndMarkChange(String group, int avg_mark) {
        this.group = group;
        this.avg_mark = avg_mark;
        System.out.println("Группа студента изменена на: " + group);
        System.out.println("Оценка студента изменена на: " + avg_mark);
    }

    //      Задание 7
    public Student[] getStudents(Student[] students, int avg_mark) {
        int count = 0;
        for (Student student : students) {
            if (student.avg_mark > avg_mark) {
                count++;
            }
        }
        Student[] studentHighMark = new Student[count];
        System.out.println("Студенты со средней оценкой выше " + avg_mark);
        int ihm = 0;
        for (Student student : students) {
            if (student.avg_mark > avg_mark) {
                studentHighMark[ihm] = student;
                ihm++;
            }
        }
        return studentHighMark;
    }
//к заданию 6
    public Student(int id, String name, String surname, String faculty, int course, String group, int avg_mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.avg_mark = avg_mark;
    }


}



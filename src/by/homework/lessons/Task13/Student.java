package by.homework.lessons.Task13;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private String birthDate;
    private String birthTown;
    private int averageMark;

    public Student(String name, String surname, String birthDate, String birthTown, int averageMark) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.birthTown = birthTown;
        this.averageMark = averageMark;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthTown() {
        return birthTown;
    }

    public void setBirthTown(String birthTown) {
        this.birthTown = birthTown;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(birthDate, student.birthDate) && Objects.equals(birthTown, student.birthTown) && Objects.equals(averageMark, student.averageMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, birthTown, averageMark);
    }


    public String toString() {
        String result = "Имя, фамилия: " + name + " " + surname + ", Дата рождения: " + birthDate + ", Город: " + birthTown +
                ", Средний балл: " + averageMark;
        return result;
    }


}

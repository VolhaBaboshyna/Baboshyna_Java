package by.homework.lessons.Task15;

public class Employee {
    private String identificationNumber;
    private String name;
    private String surname;
    private int age;
    private double salary;

    public Employee(String identificationNumber, String name, String surname, int age, double salary) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String toString() {
        return "Идентификационный номер: " + identificationNumber + ", Имя: " + name + ", Фамилия: " + surname +
        ", Возраст: " + age + ", Зарплата: " + salary;
    }
}

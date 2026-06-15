package by.homework.lessons.Task14;

import java.util.Objects;

public class Patient {
    private int uniqueIdentifier;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    public Gender gender;

    public Patient(int uniqueIdentifier, String name, String surname, String diagnosis, int age, Gender gender) {
        this.uniqueIdentifier = uniqueIdentifier;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(int uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Gender getGender() {
        return gender;
    }


    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return uniqueIdentifier == patient.uniqueIdentifier && age == patient.age && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(diagnosis, patient.diagnosis) && gender == patient.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueIdentifier, name, surname, diagnosis, age, gender);
    }

    @Override
    public String toString() {
        return "Пациент " +
                "Уникальный номер: " + uniqueIdentifier +
                ", Имя: " + name +
                ", Фамилия: " + surname +
                ", Диагноз: " + diagnosis +
                ", Возраст: " + age +
                ", Пол: " + gender.getGender();
    }
}

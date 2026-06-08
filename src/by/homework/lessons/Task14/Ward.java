package by.homework.lessons.Task14;

import java.util.HashSet;
import java.util.Set;

public class Ward {
    private int number;
    private Gender type;
    Set<Patient> patients;

    public Ward(int number, Gender type) {
        this.number = number;
        this.type = type;
        this.patients = new HashSet<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Gender getType() {
        return type;
    }

    public void setType(Gender type) {
        this.type = type;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public void addPatientToWard(Patient patient) {
        patients.add(patient);
    }

    @Override
    public String toString() {
        return "Палата номер: " + number +
                ", Тип: " + type.getGender() +
                ", Пациенты: " + patients;
    }
}

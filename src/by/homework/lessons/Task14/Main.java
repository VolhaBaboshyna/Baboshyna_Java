package by.homework.lessons.Task14;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1, "Анна", "Ковалёва", "Астма", 28, Gender.FEMALE);
        Patient patient2 = new Patient(2, "Иван", "Петров", "Перелом", 45, Gender.MALE);
        Patient patient3 = new Patient(3, "Мария", "Сидорова", "Астма", 34, Gender.FEMALE);
        Patient patient4 = new Patient(4, "Дмитрий", "Козлов", "Перелом", 60, Gender.MALE);
        Patient patient5 = new Patient(5, "Елена", "Морозова", "Астма", 31, Gender.FEMALE);
        Patient patient6 = new Patient(6, "Алексей", "Волков", "Перелом", 25, Gender.MALE);
        Patient patient7 = new Patient(7, "Ольга", "Лебедева", "Депрессия", 52, Gender.FEMALE);
        Patient patient8 = new Patient(8, "Сергей", "Новиков", "Депрессия", 38, Gender.MALE);
        Patient patient9 = new Patient(9, "Татьяна", "Белова", "Депрессия", 41, Gender.FEMALE);
        Patient patient10 = new Patient(10, "Николай", "Семёнов", "Депрессия", 67, Gender.MALE);
        Patient patient11 = new Patient(10, "Николай", "Семёнов", "Депрессия", 67, Gender.MALE);

        Ward ward1 = new Ward(1, Gender.FEMALE);
        Ward ward2 = new Ward(2, Gender.FEMALE);
        Ward ward3 = new Ward(3, Gender.MALE);
        Ward ward4 = new Ward(4, Gender.MALE);

        ward1.addPatientToWard(patient1);
        System.out.println(ward1);
        ward1.addPatientToWard(patient5);
        ward1.addPatientToWard(patient3);
        ward2.addPatientToWard(patient2);
        ward2.addPatientToWard(patient4);
        ward2.addPatientToWard(patient6);
        ward3.addPatientToWard(patient7);
        ward3.addPatientToWard(patient9);
        ward4.addPatientToWard(patient8);
        ward4.addPatientToWard(patient10);
        ward4.addPatientToWard(patient11);
        System.out.println(ward2);

        ward1.addPatientToWardByDiagnosis(patient9);

        Department department1 = new Department("Терапевтическое");
        Department department2 = new Department("Хирургическое");
        Department department3 = new Department("Психиатрическое");

        department1.addWardToDepartment(ward1);
        department2.addWardToDepartment(ward2);
        department3.addWardToDepartment(ward3);
        department3.addWardToDepartment(ward4);

//        System.out.println(department3.genderCount());
        System.out.println(department3.genderCount());


    }
}

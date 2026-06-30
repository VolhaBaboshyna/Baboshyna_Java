package by.homework.lessons.Task15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("123qwe123", "Венцеслав", "Венгражановский", 33, 1234.56);
        Employee employee2 = new Employee("456asd456", "Анна", "Ковалёва", 28, 1300.00);
        Employee employee3 = new Employee("789zxc789", "Дмитрий", "Петров", 45, 1500.75);
        Employee employee4 = new Employee("246qay789", "Елена", "Сидорова", 38, 1420.30);
        Employee employee5 = new Employee("135weq963", "Михаил", "Иванов", 50, 1600.00);
        Employee employee6 = new Employee("987poi654", "Оксана", "Жукова", 31, 1250.90);
        Employee employee7 = new Employee("654lkj321", "Артём", "Нестеренко", 29, 1180.45);
        Employee employee8 = new Employee("321mnb123", "Татьяна", "Бондарева", 36, 1380.60);

        Map<Employee, String> employees = new HashMap<>();
        employees.put(employee1, "Архитектор данных");
        employees.put(employee2, "HR-специалист");
        employees.put(employee3, "Ведущий разработчик");
        employees.put(employee4, "Финансовый аналитик");
        employees.put(employee5, "Директор по операциям");
        employees.put(employee6, "Маркетолог");
        employees.put(employee7, "Системный администратор");
        employees.put(employee8, "Ведущий бухгалтер");

        System.out.println(employees);

        raiseSalaryForProfession(employees, "HR-специалист", 300);

        System.out.println(employees);

        System.out.println(reverseCollection(employees));

    }


    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            String empProfession = entry.getValue();
            if (profession.equals(empProfession)) {
                entry.getKey().setSalary(entry.getKey().getSalary() + amountOfIncrease);
            }
        }
    }

    private static HashMap<String, Collection<Employee>> reverseCollection(Map<Employee, String> employees) {
        HashMap<String, Collection<Employee>> newEmployees = new HashMap<>();
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee employee = entry.getKey();
            String profession = entry.getValue();
            if (!newEmployees.containsKey(profession)) {
                newEmployees.put(profession, new ArrayList<>());
            }
            newEmployees.get(profession).add(employee);
        }
        return newEmployees;
    }
}

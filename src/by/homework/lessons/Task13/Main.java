package by.homework.lessons.Task13;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", "11.01.2010", "Барановичи", 6);
        Student student2 = new Student("Григорий", "Григорьев", "17.04.2011", "Осиповичи", 5);
        Student student3 = new Student("Дмитрий", "Дмитриев", "31.02.2012", "Бобруйск", 8);

        Group group1 = new Group(1);
        Group group2 = new Group(2);
        Group group3 = new Group(3);

        group1.addStudents(student1);
        group2.addStudents(student2);
        group3.addStudents(student3);

        Faculty faculty1 = new Faculty("Экономический");
        Faculty faculty2 = new Faculty("Инженерный");

        faculty1.addGroup(group1);
        faculty1.addGroup(group2);
        faculty2.addGroup(group3);

        group2.removeStudentsByMark(4);
        System.out.println(group2.toString());
        System.out.println(group1.toString());
        group1.transferToGroup(group2);
        System.out.println(group2);
        System.out.println(group1);

        System.out.println(group3.averageGroupMark());
        faculty1.isFacultyActive();

        System.out.println(faculty1.getFacultyType());


    }

}

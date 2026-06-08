package by.homework.lessons.Task13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private int groupNumber;
    private List<Student> students = new ArrayList<>();

    public Group(int groupNumber) {
        super();
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupNumber == group.groupNumber && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupNumber, students);
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public List<Student> getStudent() {
        return students;
    }

    public String toString() {
        String result = "Группа " + groupNumber + ": " + students;
        return result;
    }


    public void removeStudentsByMark(int mark) {
        students.removeIf(student -> student.getAverageMark() < mark);
    }

    public void transferToGroup(Group newGroup) {
        if (this.students.size() < 2) {
            newGroup.students.addAll(this.students);
            this.students.clear();
            System.out.println("Студенты успешно перенесены в новую группу.");
        } else {
            System.out.println("Группа содержит 2 или более студентов. Перенос невозможен.");
        }
    }

    public double averageGroupMark() {
        if (this.students.isEmpty()) {
            System.out.println("Студентов в группе нет");
            return 0;
        } else {
            int count = this.students.size();
            int sum = 0;
            for (Student student : students) {
                sum += student.getAverageMark();
            }
            return (double) sum / count;
        }

    }
}


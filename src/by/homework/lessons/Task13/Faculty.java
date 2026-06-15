package by.homework.lessons.Task13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static by.homework.lessons.Task13.FacultyType.ACTIVE;

public class Faculty {
    private String name;
    List<Group> groups;
    public FacultyType FacultyType;

    public Faculty(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getFacultyType() {
        String result;
        if (FacultyType == ACTIVE) {
            result=name + " - Активный факультет";
        } else {
            result=name + " - Неактивный факультет";
        }
        return result;
    }

    public void setFacultyType(FacultyType FacultyType) {
        this.FacultyType = FacultyType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(name, faculty.name) && Objects.equals(groups, faculty.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, groups);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void isFacultyActive() {
        if (groups.size() < 20) {
            this.FacultyType = by.homework.lessons.Task13.FacultyType.NOT_ACTIVE;
        } else {
            this.FacultyType = ACTIVE;
        }
    }



}

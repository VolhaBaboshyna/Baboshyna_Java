package by.homework.lessons.Task14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String departmentName;
    Set<Ward> wards;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.wards = new HashSet<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    public void setWards(Set<Ward> wards) {
        this.wards = wards;
    }

    @Override
    public String toString() {
        return "Отделение " + departmentName +
                ", Палаты: " + wards;
    }

    public void addWardToDepartment(Ward ward){
        wards.add(ward);
    }

    public int genderCount (){
        int manCount=0, womanCount=0;
        for (Ward ward:)
        return manCount, womanCount;
    }
}

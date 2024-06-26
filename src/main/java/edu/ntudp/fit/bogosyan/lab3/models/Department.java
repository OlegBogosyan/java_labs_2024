package edu.ntudp.fit.bogosyan.lab3.models;

import java.util.List;

public class Department {
    private String departmentName;
    private Human headOfDepartmentName;
    private List<Group> groups;


    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setHeadOfDepartmentName(Human headOfDepartmentName) {
        this.headOfDepartmentName = headOfDepartmentName;
    }


    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Human getHeadOfDepartmentName() {
        return headOfDepartmentName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "назва відділу = '" + departmentName + '\'' + "\n" +
                "голова відділу = " + headOfDepartmentName + "\n" +
                "група = " + groups;
    }
}
package edu.ntudp.fit.bogosyan.lab3.models;

import java.util.List;

public class University {
    private String universityName;
    private Human headOfUniversityName;
    private List<Faculty> faculties;

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setHeadOfUniversityName(Human headOfUniversityName) {
        this.headOfUniversityName = headOfUniversityName;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Human getHeadOfUniversityName() {
        return headOfUniversityName;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        return "Назва університету = '" + universityName + '\'' + "\n" +
                "Голова університету = " + headOfUniversityName + "\n" +
                "Факультет = " + faculties + "\n";
    }
}

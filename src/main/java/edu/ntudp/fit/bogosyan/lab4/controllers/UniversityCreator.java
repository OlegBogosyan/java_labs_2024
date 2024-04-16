package edu.ntudp.fit.bogosyan.lab4.controllers;

import edu.ntudp.fit.bogosyan.lab3.models.*;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {
    private static final StudentCreator newStudent = new StudentCreator();
    private static final GroupCreator newGroup = new GroupCreator();
    private static final DepartmentCreator newDepartment = new DepartmentCreator();
    private static final FacultyCreator newFaculty = new FacultyCreator();

    public static University createUniversity(List<Faculty> faculties, String universityName, Human headOfUniversityName) {
        University newUniversity = new University();
        newUniversity.setFaculties(faculties);
        newUniversity.setUniversityName(universityName);
        newUniversity.setHeadOfUniversityName(headOfUniversityName);
        return newUniversity;
    }

    public static University createTypicalUniversity() {
        Human headOfPZKSName = new Human("Горбачук", "Щек", "Любомирович", Sex.MALE);
        Human headOfSAUName = new Human("Стефаник", "Евеліна", "Русланівна", Sex.FEMALE);
        Human headOfFacultyName = new Human("Юхновський", "Іван", "Ярославович", Sex.MALE);
        Human headOfUniversityName = new Human("Козачинська", "Славолюба", "Яромирівна", Sex.FEMALE);

        Student firstStudent = newStudent.createStudent("Устиянович", "Федір", "Макарович", Sex.MALE);
        Student secondStudent = newStudent.createStudent("Ревуцький", "Оремів ", "Йосипович", Sex.MALE);
        Student thirdStudent = newStudent.createStudent("Поважна", "Шарлота", "Максимівна", Sex.FEMALE);
        Student fourthStudent = newStudent.createStudent("Натальїна", "Ганна", "Любомирівна", Sex.FEMALE);
        Student fifthStudent = newStudent.createStudent("Івахів", "Яволод", "Панасович", Sex.MALE);
        Student sixthStudent = newStudent.createStudent("Колодний", "Творислав", "Любомирович", Sex.MALE);
        Student seventhStudent = newStudent.createStudent("Тракало", "Цецілія", "Пилипівна", Sex.FEMALE);
        Student eighthStudent = newStudent.createStudent("Швидка", "Емма", "Устимівна", Sex.FEMALE);
        Student ninthStudent = newStudent.createStudent("Антонюк", "Предислав", "Федорович", Sex.MALE);

        List<Student> studentsOfGroupComputerEngineering = new ArrayList<>();
        studentsOfGroupComputerEngineering.add(firstStudent);
        studentsOfGroupComputerEngineering.add(secondStudent);
        studentsOfGroupComputerEngineering.add(thirdStudent);
        studentsOfGroupComputerEngineering.add(fourthStudent);
        studentsOfGroupComputerEngineering.add(fifthStudent);
        studentsOfGroupComputerEngineering.add(sixthStudent);

        List<Student> studentsOfGroupSystemAnalysis = new ArrayList<>();
        studentsOfGroupSystemAnalysis.add(seventhStudent);
        studentsOfGroupSystemAnalysis.add(eighthStudent);

        List<Student> studentsOfGroupSoftwareEngineering = new ArrayList<>();
        studentsOfGroupSoftwareEngineering.add(ninthStudent);


        Group firstGroup = createGroup("123-20-1", firstStudent, studentsOfGroupComputerEngineering);
        Group secondGroup = createGroup("123-20-2", seventhStudent, studentsOfGroupSystemAnalysis);
        Group thirdGroup = createGroup("121-20-1", ninthStudent, studentsOfGroupSoftwareEngineering);

        List<Group> groupsOfPZKS = new ArrayList<>();
        groupsOfPZKS.add(firstGroup);
        groupsOfPZKS.add(thirdGroup);

        List<Group> groupsOfSau = new ArrayList<>();
        groupsOfSau.add(secondGroup);

        Department firstDepartment = createDepartment("PZKS", headOfPZKSName, groupsOfPZKS);
        Department secondDepartment = createDepartment("SAU", headOfSAUName, groupsOfSau);

        List<Department> departments = new ArrayList<>();
        departments.add(firstDepartment);
        departments.add(secondDepartment);

        Faculty newFaculty = createFaculty("FIT", headOfFacultyName, departments);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(newFaculty);

        return createUniversity(faculties, "Dnipro University of Technology", headOfUniversityName);

    }

    private static Group createGroup(String groupCode, Human headOfGroupName, List<Student> students) {
        return newGroup.createGroup(students, groupCode, headOfGroupName);
    }

    private static Department createDepartment(String departmentName, Human headOfDepartmentName, List<Group> groups) {
        return newDepartment.createDepartment(groups, departmentName, headOfDepartmentName);
    }

    private static Faculty createFaculty(String facultyName, Human headOfFacultyName, List<Department> departments) {
        return newFaculty.createFaculty(departments, facultyName, headOfFacultyName);
    }
}

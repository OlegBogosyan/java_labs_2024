package edu.ntudp.fit.bogosyan.lab4.controllers;

import edu.ntudp.fit.bogosyan.lab3.models.Sex;
import edu.ntudp.fit.bogosyan.lab3.models.Student;

public class StudentCreator {
    public Student createStudent(String lastName, String firstName, String patronymicName, Sex sex) {
        return new Student(lastName, firstName, patronymicName, sex);
    }
}
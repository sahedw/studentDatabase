package org.example.model;

import java.util.*;

public class StudentDB {

    private Map<String, Student> students;

    public StudentDB(Map<String, Student> students) {
        this.students = students;
    }

    public Map<String, Student> getAllStudents() {
        return this.students;
    }

    public Student randomStudent() {

        int randomNumber = (int) Math.round(Math.random() * (students.size() - 1));

        return (Student) students.values().toArray()[randomNumber];

    }


    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}

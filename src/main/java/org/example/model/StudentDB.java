package org.example.model;

import java.util.*;

public class StudentDB {

    private final List<Student> students;

    public StudentDB() {
        this.students = new ArrayList<>();

        students.add(0, new Student("Elias", "1"));
        students.add(1, new Student("Sharoz", "2"));
        students.add(2, new Student("Sahed", "3"));
    }

    public List<Student> getAllStudents() {
        return this.students;
    }

    public Student findById(String studentId) {
        Student searchedStudent = null;
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                searchedStudent = student;
            }
        }
        return searchedStudent;
    }

    public Student randomStudent() {

        int randomNumber = (int) Math.round(Math.random() * (students.size() - 1));

        return (Student) students.get(randomNumber);

    }


    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}

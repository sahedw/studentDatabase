package org.example;

import org.example.model.Student;
import org.example.model.StudentDB;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student tom = new Student("Tom", "1");
        Student steven = new Student("Steven", "2");
        Student julian = new Student("Julian", "3");
        Student marc = new Student("Marc", "4");

        Map<String, Student> mapOfStudents = new HashMap<>(Map.of("Tom", tom, "Steven", steven, "Julian", julian, "Marc", marc));

        StudentDB database = new StudentDB(mapOfStudents);

        // System.out.println(Arrays.toString(database.getAllStudents()));

        // System.out.println(tom.getName());

         System.out.println(database.getAllStudents());

        System.out.println(database.toString());

        System.out.println(database.randomStudent());

    }
}
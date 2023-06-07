package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void yieldTrue_whenGetAllStudentsGetsCalled() {
        //GIVEN
        Student tom = new Student("Tom", "1");
        Student steven = new Student("Steven", "2");
        Student julian = new Student("Julian", "3");
        Student marc = new Student("Marc", "4");

        Map<String, Student> mapOfStudents = new HashMap<>(Map.of("Tom", tom, "Steven", steven, "Julian", julian, "Marc", marc));
        StudentDB database = new StudentDB(mapOfStudents);

        //WHEN
        Map<String, Student> expected = new HashMap<>(Map.of("Tom", tom, "Steven", steven, "Julian", julian, "Marc", marc));
        Map<String, Student> actual = database.getAllStudents();

        //THEN
        assertNotEquals(expected, actual);
    }

    @Test
    void yieldTrue_whenToStringGetsCalled() {
        //GIVEN
        Student tom = new Student("Tom", "1");
        Student steven = new Student("Steven", "2");
        Student julian = new Student("Julian", "3");
        Student marc = new Student("Marc", "4");

        Map<String, Student> mapOfStudents = new HashMap<>(Map.of("Tom", tom, "Steven", steven, "Julian", julian, "Marc", marc));
        StudentDB database = new StudentDB(mapOfStudents);

        //WHEN
        String expected = "StudentDB{students={Marc=Student{name='Marc', id='4'}, Tom=Student{name='Tom', id='1'}, Julian=Student{name='Julian', id='3'}, Steven=Student{name='Steven', id='2'}}}";
        String actual = database.toString();

        //THEN
        assertEquals(expected, actual);
    }

}
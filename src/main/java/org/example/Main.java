package org.example;

import org.example.model.Student;
import org.example.model.StudentDB;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        StudentDB db = new StudentDB();

        System.out.println(db.findById("3"));
    }
}
package com.day27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Details {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(10, "Mohan", "mishra"));
        student.add(new Student(11, "Anand", "yadav"));
        student.add(new Student(12, "kishor", "Kumar"));
        System.out.println("before sorting");
        System.out.println("Student=" + student);
        System.out.println("after sorting");

       // student = student.stream().sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName)).collect(Collectors.toList());
        student.stream().sorted((x1,x2) ->x1.getLastName().compareTo(x2.getLastName())).forEach(System.out::println);

    }
}
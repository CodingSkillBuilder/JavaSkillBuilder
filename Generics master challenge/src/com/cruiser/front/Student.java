package com.cruiser.front;

import com.cruiser.util.QueryItem;


import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {
    private static int LastID = 1000;
    private final Integer id;
    private final String name;
    private final String course;
    private final int yearStarted;
    protected static Random random = new Random();
    private final static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private final static String[] courses = {"C++", "Java", "Python"};

    public Student(){
        name = firstNames[random.nextInt(5)] + (char) random.nextInt(65, 98);
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2017, 2025);
        id = LastID++;
    }

    @Override
    public String toString() {
        return "%-5d %-15s %-15s %d".formatted(id, name, course, yearStarted);
    }


    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return switch (fieldName.toUpperCase()){
            case "NAME" -> value.equalsIgnoreCase(name);
            case "COURSE" -> value.equalsIgnoreCase(course);
            case "YEARSTARTED" -> Integer.parseInt(value) == yearStarted;
            case "ID" -> Integer.parseInt(value) == id;
            default -> false;
        };
    }

    @Override
    public int compareTo(Student o) {
        return id.compareTo(o.id);
    }
}



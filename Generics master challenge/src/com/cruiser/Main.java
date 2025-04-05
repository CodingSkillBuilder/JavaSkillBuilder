package com.cruiser;

import com.cruiser.front.LPAStudent;
import com.cruiser.front.Student;
import com.cruiser.util.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i =0; i < studentCount; i++){
            students.add(new Student());
        }


        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            lpaStudents.add(new LPAStudent());
        }


        printer(students);


        var filtered = QueryList.getMatches(lpaStudents, "course", "Java");
        printer(lpaStudents);
        printer(filtered);
    }

    public static void printer(List<? extends Student> students){
        for(Student student: students){
            System.out.println(student);
        }
        System.out.println("\n\n\n");
    }
}

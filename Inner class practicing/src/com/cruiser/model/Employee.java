package com.cruiser.model;

import java.util.Comparator;

public class Employee {
    private int employeeId;
    private String name;
    private int yearStarted;


    public static class EmployeeComparator implements Comparator<Employee> {
        private final String flag;

        public EmployeeComparator(){
            this("yearStarted");
        }

        public EmployeeComparator(String flag){
            this.flag = flag;
        }


        @Override
        public int compare(Employee o1, Employee o2) {
            if (flag.equalsIgnoreCase("ID")) return Integer.valueOf(o1.employeeId).compareTo(o2.employeeId);
            if (flag.equalsIgnoreCase("NAME")) return o1.name.compareTo(o2.name);
            return Integer.valueOf(o1.yearStarted).compareTo(o2.yearStarted);
        }
    }
    public Employee() {
    }

    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }


    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
}

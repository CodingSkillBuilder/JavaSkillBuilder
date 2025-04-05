package com.cruiser;

import com.cruiser.model.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tim", "Second", 2017));
        employees.add(new Employee("Jane", "Second", 2021));
        employees.add(new Employee("Micky", "Second", 2019));
        employees.add(new Employee("Joe", "Second", 2022));
        employees.add(new Employee("Anne", "Second", 2023));
        wrapperEmployee(employees);

    }

    public static void wrapperEmployee(List<Employee> employees){
        wrapperEmployee(employees, "Year");
    }

    public static void wrapperEmployee(List<Employee> employees, String flag){
        class BuildingWrapper{
            String fullName;
            static final int currentYear = LocalDate.now().getYear();
            int serviceYears;

            public BuildingWrapper(Employee employee) {
                fullName = employee.firstName()+ employee.lastName();
                serviceYears = currentYear - employee.hireYear();
            }

            @Override
            public String toString() {
                return "%-25s %d".formatted(fullName, serviceYears);
            }

        }

        var comparator = new Comparator<BuildingWrapper>(){

            @Override
            public int compare(BuildingWrapper o1, BuildingWrapper o2) {
                if (flag.equalsIgnoreCase("Name")) return o1.fullName.compareTo(o2.fullName);

                return Integer.compare(o1.serviceYears, o2.serviceYears);
            }
        };

        List<BuildingWrapper> optimized = new ArrayList<>();

        for(Employee employee: employees){
            optimized.add(new BuildingWrapper(employee));
        }

        optimized.sort(comparator);

        for (BuildingWrapper buildingWrapper: optimized){
            System.out.println(buildingWrapper);
        }
    }
}

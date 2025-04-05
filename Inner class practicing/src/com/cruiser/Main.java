package com.cruiser;

import com.cruiser.model.Employee;
import com.cruiser.model.StoreEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carole", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018) ));

        Comparator<Employee> comparator = new Employee.EmployeeComparator();
        employees.sort(comparator);
//        System.out.println(employees);
        for(Employee employee: employees){
            System.out.println(employee);

        }


        System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019,
                        "Target"),
                new StoreEmployee(10515, "Joe", 2021,
                        "Walmart"),
                new StoreEmployee(10105, "Tom", 2020,
                        "Macys"),
                new StoreEmployee(10215, "Marty", 2018,
                        "Walmart"),
                new StoreEmployee(10322, "Bud", 2016,
                        "Target")));



        storeEmployees.sort(new StoreEmployee(). new StoreComparator());
        for (StoreEmployee storeEmployee: storeEmployees){
            System.out.println(storeEmployee);
        }

    }
}

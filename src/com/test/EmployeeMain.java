package com.test;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Vijay", 40),
                new Employee("Sagar",45),
                new Employee("Ram", 65),
                new Employee("Kamal", 50),
                new Employee("SagarGuttedar",67)
        );


        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getAge() >= 40 && emp.getAge() <= 70)
                .collect(Collectors.toList());

        filteredEmployees.forEach(System.out::println);
    }
}

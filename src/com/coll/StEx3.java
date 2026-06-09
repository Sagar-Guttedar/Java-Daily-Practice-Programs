package com.coll;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StEx3 {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();

        Employee e1 = new Employee(3,"ABC",5000);
        Employee e2 = new Employee(1,"EFG",10000);
        Employee e3 = new Employee(2,"HIJ",15000);
        Employee e4 = new Employee(5,"KLM",20000);
        Employee e5 = new Employee(4,"NOP",30000);

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        for (Employee e :set){
            System.out.println("Employee Id : "+e.getId()+" Employee Name : "+e.getEname()+" Salary : "+e.getSalary());
        }
        System.out.println("-------------------");
        System.out.println("---------Ascending Order------------");

        set.stream().sorted(Comparator.comparing(e->e.getId())).forEach((e)-> System.out.println("Employee Id: "+e.getId()+" Emplayee Name : "+e.getEname()+" Salary : "+e.getSalary()));

        System.out.println("---------Descending Order------------");
        /*set.stream().sorted(Comparator.comparing(e -> e.getId()).reversed()).forEach(e -> System.out.println("Employee Id: " + e.getId() + " Employee Name: " + e.getEname() + " Salary: " + e.getSalary()));

        System.out.println("---------Highest Salary------------");
        Optional<Employee> min=set.*/


    }
}

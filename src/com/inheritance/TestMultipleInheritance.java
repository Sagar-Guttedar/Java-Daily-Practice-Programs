package com.inheritance;

public class TestMultipleInheritance {
    public static void main(String[] args) {
        PermenentEmployee pe = new PermenentEmployee();
        pe.setEid(1234);
        pe.setEname("Sagar");
        pe.setBonus(2000);
        pe.setSalary(50000);
        pe.setLeaves(20);

        int x =pe.getEid();
        String n = pe.getEname();
        System.out.println("Employee Id : "+x+" Employee Name : "+n);
        System.out.println("Salary : "+pe.getSalary()+" Bonus : "+pe.getBonus()+" Leaves : "+pe.getLeaves());
    }

}

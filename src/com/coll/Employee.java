package com.coll;

public class Employee {
    int id;
    String ename;
    float salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, float salary){
        this.id=id;
        this.ename=name;
        this.salary=salary;

    }
}

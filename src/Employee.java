public class Employee {
    int eid;
    String ename;
    Address add;

    public Employee(int eid, String ename , Address add){
        this.eid = eid;
        this.ename =ename ;
        this.add = add;
    }

    public void display(){
        System.out.println("Employee Id : "+eid+" Employee Name : "+ename);
        System.out.println(add.toString());
        System.out.println("Hno : "+add.hno+"  City : "+add.city+" State : "+add.state);
    }
}

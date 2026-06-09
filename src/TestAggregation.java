public class TestAggregation {
    public static void main(String[] args){
        Address add = new Address(123, "BNG", "KA");
        Employee  emp = new Employee(111, "ABC", add);
        emp.display();
    }
}

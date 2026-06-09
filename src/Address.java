public class Address {
    int hno;
    String city, state;

    public Address(int hno, String city, String state){
        this.hno = hno;
        this.city = city;
        this.state = state;
        System.out.println("Finished storing a values into the varables");
    }

    public String toString(){
        return "Hno is "+hno+" City is "+city+"  State is "+state;
    }
}

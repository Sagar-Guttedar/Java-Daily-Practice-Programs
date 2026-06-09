package com.inheritance;

/*public class Address {
    int hno;
    String city,state;

    public Address(int hno,String city,String state){
        this.hno=hno;
        this.city=city;
        this.state=state;
        System.out.println("Finished storing of values into the variable.j");
    }
}*/

public class Address{
    int id;
    String city,state;

    public Address(int hno, String city,String state){
        this.id=id;
        this.city=city;
        this.state=state;
        System.out.println("Finished storing value into the variable ");
    }

    public String toString(){
        return "id : "+id+" city : "+city+ " state : "+state;
    }
}
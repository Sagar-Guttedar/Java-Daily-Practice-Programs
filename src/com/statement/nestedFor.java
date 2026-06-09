package com.statement;

public class nestedFor {
    public void test(){
        for (int i=1; i<=3; i++){
            System.out.println("Value of I :"+i);
            for (int j=3; j>0; j--){
                System.out.println("Value of I :"+i);
            }
            System.out.println("________________________________");
        }
    }

    public static void main(String[] args) {
        System.out.println("Started Executing the main method :");
        nestedFor n=new nestedFor();
        n.test();
        System.out.println("Finished Executing the main method");
    }
}

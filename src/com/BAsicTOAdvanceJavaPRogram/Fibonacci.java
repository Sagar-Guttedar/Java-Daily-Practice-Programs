package com.BAsicTOAdvanceJavaPRogram;

/*public class FibonacciEx{
    public static void main(String[] args) {
        int n=10,a=0,b=1;
        for (int i=0;i<=10;i++){
            System.out.print(a+" ");
            b=a+(a=b);
        }
    }
}*/
public class Fibonacci {
    public static void main(String[] args) {
        int n=10, num1=0,num2=1;

        System.out.println("Fibaonacci Series : "+num1+" "+num2);
        for (int i=2;i<n;i++){
            int num3 =num1+num2;
            System.out.print(" "+num3);
            num1 =num2;num2=num3;
        }
    }
}

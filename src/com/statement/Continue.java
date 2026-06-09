package com.statement;

public class Continue {
    public static void main(String[] args) {
        int i=1;
        while(i<=3){
            i++;
            continue;
        }
        System.out.println("Value of I: "+i);
    }
}

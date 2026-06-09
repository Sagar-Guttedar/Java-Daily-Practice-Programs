package com.javaPrograms;

// To print Number of Days In Given Month Using Switch Statement
// Input = 12  Output = decemebr : 30

// Janaury : 31
// February : 28/29
// March : 31
// April : 30
// May : 31
// June : 30
// July : 31
// August : 30
// September : 31
// October ; 30
// November ; 31
// December : 30

public class NumberOfDaysInMonthss {
    public static void main(String[] args) {
        int number=4;

        switch(number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("  31");
                break;
            case 2:
                System.out.println(" 28/29");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println(" 30");
                break;
            default:
        }        System.out.println("Number is not valid");
    }
}

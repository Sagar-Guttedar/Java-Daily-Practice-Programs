package com.patternPro;

//Traingle
/*public class TrainglePatternPro {
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}*/

// Reverse Traingle
/*public class TrainglePatternPro {
    public static void main(String[] args) {
        for (int i=5; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}*/

// Right Traingle
/*
public class TrainglePatternPro{
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
            for (int k=1;k<=5-i;k++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}*/

// Traingle
/*
public class TrainglePatternPro{
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
            for (int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}*/


/*
public class TrainglePatternPro{
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
           for (int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if (i==5 || j==1 || j==i  ){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}*/


//
public class TrainglePatternPro{
    public static void main(String[] args) {
        for (int i=5;i>=1;i--){
            for (int k=5-1; k>=i;k--){
                System.out.print(" "+" ");
            }
            for (int j=1; j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
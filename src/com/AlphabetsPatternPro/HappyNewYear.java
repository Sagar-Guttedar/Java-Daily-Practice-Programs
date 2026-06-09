package com.AlphabetsPatternPro;

public class HappyNewYear {
    public static void main(String[] args) {

        // Letter H
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Space between H and A
            System.out.print("   ");

            // Letter A
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 5 || j == 1 || i == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Space between A and P
            System.out.print("   ");

            // Letter P
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || i == 1 || (i == 2 && j == 5) || (i == 3 && j == 5) || i == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Space between P and P
            System.out.print("   ");

            // Letter P again
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || i == 1 || (i == 2 && j == 5) || (i == 3 && j == 5) || i == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Space between P and Y
            System.out.print("   ");

            // Letter Y
            for (int j = 1; j <= 5; j++) {
                if ((i == 4 && j == 3) || (i == 5 && j == 3) || (i == 3 && j == 3) || (i == 2 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 4) || (i == 1 && j == 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }

        // New line for "N"
        System.out.println();
        System.out.println();

        // Letter N
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Space between N and E
            System.out.print("  ");

            // Letter E
            for (int j=1; j<=5; j++){
                if (i==1 || i==5 || j==1 || i==3){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }

            // Space between E and W
            System.out.print("   ");

            // Letter W
            for (int j=1;j<=5;j++){
                if(j==1 || j==5 ||(i==4 && j==2)||(i==4&&j==4)||i==3 && j==3){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }


            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Letter y
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if((i==4 &&  j==3) || (i==5 && j==3)||(i==3 && j==3)|| (i==2 && j==2)|| (i==1 && j==1)|| (i==2 && j==4)||(i==1 && j==5)){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }

            // Space between Y and E
            System.out.print("  ");

            // Letter E
            for (int j=1; j<=5; j++){
                if (i==1 || i==5 || j==1 || i==3){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }

            // Space between E and A
            System.out.print("   ");

            // Letter A
            for (int j=1; j<=5; j++){
                if ( i==1 || j==5 || j==1 || i==3 ){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }

            // Space between A and R
            System.out.print("   ");

            // Letter R
            for (int j=1;j<=5;j++){
                if(j==1 || (i==1) || (i==2 && j==5) || (i==3 && j==5) || i==3 || (i==4 && j==3) || (i==5 && j==5) ){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }

            // Space between R and 2
            System.out.print("           ");

            // Number 2
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || i==3 || (i == 2 && j == 5) || (i == 3 && j == 5) || (i == 4 && j == 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Space between 2 and 0
            System.out.print("   ");

            // Number 0
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j==1 || j==5 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Space between 0 and 2
            System.out.print("   ");

            // Number 2
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || i==3 || (i == 2 && j == 5) || (i == 3 && j == 5) || (i == 4 && j == 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Space between 2 and 5
            System.out.print("   ");

            // Number 5
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || i==3 || (i == 2 && j == 1) || (i == 4 && j == 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }


    }
}

package com.AlphabetsPatternPro;

public class S {
    public static void main(String[] args) {
        // Print two "S" side by side
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                // First "S" pattern
                if (i == 1 || i == 5 || (i == 2 && j == 1) || i == 3 || (i == 4 && j == 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Space between the two "S"
            System.out.print("  ");

            // Second "S" pattern (same as the first)
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || (i == 2 && j == 1) || i == 3 || (i == 4 && j == 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

package Assignment;

import java.util.Scanner;
/*
Type a program to enter five students marks using Nested Loop
 Inner and Outer loop counter in java
 */
public class Students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] marks = new int[5][3];
        // Outer loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            // Inner loop
            for (int j = 0; j < 3; j++) {
                marks[i][j] = input.nextInt();
            }
        }
       // input.close();
    }
}

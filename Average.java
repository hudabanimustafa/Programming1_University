package Assignment;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three grades
        System.out.print("Enter three grades (separated by spaces): ");
        int grade1 = input.nextInt();
        int grade2 = input.nextInt();
        int grade3 = input.nextInt();

        // Calculate the average of the grades
        double average = (grade1 + grade2 + grade3) / 3.0;

        // Check if the average is greater than or equal to 50, and print out "pass" or "fail" accordingly
        if (average >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}

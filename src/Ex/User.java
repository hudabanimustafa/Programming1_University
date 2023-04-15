package Ex;

import java.util.Scanner;

/**
 *
 * @author Huda Bani Mustafa
 */
public class User {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter First name");

        // NEXT ONE WORD
        String FirstName = X.nextLine();  // Read user input
        System.out.println("Enter the last name :");
        String LastName=X.nextLine();
        System.out.println("the Full Name is: " + FirstName+" "+LastName);  // Output user input
        // System.out.println("the last name  is: " + LastName);

    }


}

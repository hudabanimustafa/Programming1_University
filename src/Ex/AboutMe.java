package Ex;

import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner H = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = H.nextLine();

        System.out.print("Enter your age: ");
        int age = H.nextInt();
        H.nextLine();

        System.out.print("Enter your specialization: ");
        String specialization = H.nextLine();

        System.out.print("Enter your date of birth : ");
        String dateOfBirth = H.nextLine();

        System.out.print("Enter your place of residence: ");
        String residence = H.nextLine();

        System.out.print("Enter your nationality: ");
        String nationality = H.nextLine();



        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Place of residence: " + residence);
        System.out.println("Nationality: " + nationality);


        // H.close();
    }
}

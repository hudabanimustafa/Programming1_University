package Ex;


import java.util.Scanner;

public class ASCII {

    /*
 Write a Java program that reads a character from the keyboard, then check the type of this character
according to the following table:
ASCII Type
65 – 90 “Capital letters”
97 – 122 “Small letters”
48 – 57 “Digits”
Others “Special symbols”
     */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a character: ");
            char inputChar = scanner.next().charAt(0);

            if (Character.isUpperCase(inputChar)) {
                System.out.println("Capital letters");
            } else if (Character.isLowerCase(inputChar)) {
                System.out.println("Small letters");
            } else if (Character.isDigit(inputChar)) {
                System.out.println("Digits");
            } else {
                System.out.println("Special symbols");
            }
        }
    }



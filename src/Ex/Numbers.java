package Ex;

import java.util.Scanner;
/*
Java program that reads three numbers,
then find and print out the maximum number
among them.
 */
public class Numbers {
    public static void main(String[]args){
       // int n1,n2,n3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 three Number : ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
         // if
        if (n1>n2 && n1>n3){
            System.out.println("The maximum number is "+n1);
        } else if (n2>n1 && n2>n3) {
            System.out.println("The maximum numbers is "+ n2);

        } else {
            System.out.println("The maximum numbers is "+n3);
        }

    }

  /*
    // Another way to solved
    Scanner input_2 = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int num1 = input_2.nextInt();
    int num2 = input_2.nextInt();
    int num3 = input_2.nextInt();

    int max = num1;
        if (num2 > max) {
        max = num2;
    }
        if (num3 > max) {
        max = num3;
    }

        System.out.println("The maximum number is " + max);
   */
}



package Ex;

import java.util.Scanner;
/*
Java program that reads a gender for an employee and the
salary for this employee, the find out and print out the salary after
bonus.
 */
public class Employee {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Read a gender for an employee");
        char g=input.next().charAt(0);
        System.out.println("Read the salary for the employee");
        double sal=input.nextDouble();
        double salbonus;
        if (g == 'M' || g == 'm') {
            if(sal >= 2500)
                salbonus = sal + (sal*0.2);
            else
                salbonus = sal + (sal*0.25);
        } else if (g == 'G' || g == 'g') {
            if(sal >= 2500)
                salbonus = sal + (sal*0.3);
            else
                salbonus = sal + (sal*0.35);
        } else {
            System.out.println("Invalid gender input");
            return;
        }
        System.out.println("The salary after bonus is "+salbonus);
    }
}


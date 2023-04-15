package Ex;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one of these Operators: * / + -");
        char C = in.next().charAt(0);
        int n1 , n2 ;
        System.out.println("Enter n1 :");
        n1 = in.nextInt();
        System.out.println("Enter n2 : ");
        n2 = in.nextInt();
        switch (C){
            case '*':
                System.out.println("res = "+n1*n2);
                break;
            case '/':
                System.out.println("res = "+n1/n2);
                break;
            case '-':
                System.out.println("res =" + (n1 - n2));
                break;
            case '+':
                System.out.println("res = "+n1+n2);
        }
    }
}

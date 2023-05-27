package Assignment;

import java.util.Scanner;

public class AVG_Program {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double []num = new double[5];
        for (int i=0;i<num.length;i++){
            System.out.println("Enter the numbers :");
            num[i]=input.nextDouble();
        }
        //  the biggest number
        double bigNumbers=num[0];
        for (int i =0;i<num.length;i++){
            if (num[i]>bigNumbers){
                bigNumbers=num[i];
            }
        }
        // Calculate the average
        double AVG=0;
        for (int i =0;i<num.length;i++){
            AVG+=num[i];
        }
        AVG = AVG / num.length;
        
        System.out.println("The biggest number is "+bigNumbers);
        System.out.println("the average is "+AVG);

    }
}

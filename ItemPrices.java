package Assignment;

import java.util.Scanner;

public class ItemPrices {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three item prices
        System.out.print("Enter the prices of three items (separated by spaces): ");
        double price1 = input.nextDouble();
        double price2 = input.nextDouble();
        double price3 = input.nextDouble();

        // Calculate the sum of the item prices
        double sum = price1 + price2 + price3;

        // Check if the sum is greater than 500, and print out "There is a need for a discount" or "There is no need for a discount" accordingly
        if (sum > 500) {
            System.out.println("There is a need for a discount");
        } else {
            System.out.println("There is no need for a discount");
        }
    }
}

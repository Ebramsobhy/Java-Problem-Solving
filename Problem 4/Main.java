/*   Problem 4       (Financial application to calculate tips)
     Write a program that reads the subtotal and the gratuity rate,
     then computes the gratuity and total. For example, if the user enters 10 for subtotal
     and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
 */

import java.util.Scanner;

public class Main {

    public static final double Gratuity_Percentage = 100.0;

    public static double getValue(Scanner input, String valueName)
    {
        System.out.print("Please enter the " + valueName + ": ");
        while (!input.hasNextDouble()){
            System.out.println("Invalid input. Please enter a valid number.");
            input.next();
        }
        return input.nextDouble();
    }

    public static double calcGratuity(double subtotal, double gratuityPercentage)
    {
        return (subtotal * gratuityPercentage) / Gratuity_Percentage;
    }

    public static double calculateTotalWithGratuity(double subtotal, double gratuityPercentage){
        return subtotal + calcGratuity(subtotal, gratuityPercentage);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotalValue  = getValue(input, "Subtotal");
        double gratuityValue  = getValue(input, "Gratuity Percentage");

        double subtotalResult  = calculateTotalWithGratuity(subtotalValue, gratuityValue);
        double gratuityResult  = calcGratuity(subtotalValue, gratuityValue);

        System.out.printf("The gratuity is $%.1f and the total is $%.1f.%n", gratuityResult , subtotalResult);
    }

}
/*   Problem 1   (Convert Celsius to Fahrenheit)
     Write a program that reads a Celsius degree in a double value from the console,
     then converts it to Fahrenheit and displays the result.
     The formula for the conversion is as follows:
     fahrenheit = (9 / 5) * celsius + 32
 */

import java.util.Scanner;

public class Main {


    public static double convertToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }

    
    public static double getValidCelsiusInput(Scanner input) {
        double celsius;
        while (true) {
            System.out.print("Enter a degree in Celsius: ");
            if (input.hasNextDouble()) {
                celsius = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); // Clear the invalid input
            }
        }
        return celsius;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueConversion = true;

        
        while (continueConversion) {
            double celsius = getValidCelsiusInput(input);
            double fahrenheit = convertToFahrenheit(celsius);

            System.out.printf("%.0f Celsius is %.1f Fahrenheit%n", celsius, fahrenheit);

            
            System.out.print("Would you like to convert another temperature? (yes/no): ");
            String response = input.next().trim().toLowerCase();

            if (!response.equals("yes")) {
                continueConversion = false;
                System.out.println("Exiting the program. Thank you!");
            }
        }

        input.close();
    }
}
/*   Problem 3       (Convert feet into meters)
     Write a program that reads a number in feet, converts it to meters,
     and displays the result. One foot is 0.305 meter.
 */

import java.util.Scanner;

public class Main {

    public static final double FOOT_TO_METER = 0.305;

    public static double getInputFeet(Scanner input)
    {
        System.out.print("Enter a value for feet: ");
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            input.next();
        }
        return input.nextDouble();
    }

    public static double convertFeetIntoMeters(double feetValue)
    {
        return feetValue * FOOT_TO_METER;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double feetValue = getInputFeet(input);
        double feetToMeters = convertFeetIntoMeters(feetValue);

        System.out.printf("%.1f feet is %.4f meters.%n", feetValue, feetToMeters);

        input.close();
    }
}
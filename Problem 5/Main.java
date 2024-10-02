/*   Problem 5       (Sum the digits in an integer)
     Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
     For example, if an integer is 932, the sum of all its digits is 14.
 */

import java.util.Scanner;

public class Main {

    public static int getNumber(Scanner input)
    {
        int number = 0;
        System.out.println("Please Enter Integer Number Between 0 and 1000");
        while (true){
             if (input.hasNextInt()) {
             number = input.nextInt();

                  if (number >= 0 && number <= 1000){
                     break;
                  }else {
                     System.out.println("Invalid range, please enter a number between 0 and 1000");
                  }
            }else {
                 System.out.println("Invalid input, please enter an integer.");
                 input.next();
             }
    }
        return number;
    }

    public static int sumDigitsOfInteger(int number)
    {
        int sumDigits = 0;

        while (number > 0) {
            sumDigits += number % 10;  // Get the last digit of the number
            number = number / 10;     // Remove the last digit
        }

        return sumDigits;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = getNumber(input);
        int result = sumDigitsOfInteger(number);

        System.out.printf("The sum of the digits is %d", result);
        input.close();
    }
}

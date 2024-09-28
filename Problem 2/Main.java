/*   Problem 2    (Compute the volume of a cylinder)
     Write a program that reads in the radius and length of a cylinder
     and computes the area and volume using the following formulas:
     area = radius * radius * PI
     volume = area * length
 */

import java.util.Scanner;

public class Main {

    public static final double PI = 3.141592653589793;

    public static double getCylinderDimension(Scanner input, String dimensionName) {
        System.out.print("Enter the " + dimensionName + " of the cylinder: ");
        return input.nextDouble();
    }

    public static double computeCylinderArea(double cylinderRadius) {
        return cylinderRadius * cylinderRadius * PI;
    }

    public static double computeCylinderVolume(double cylinderArea, double cylinderLength) {
        return cylinderArea * cylinderLength;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cylinderRadius = getCylinderDimension(input, "radius");
        double cylinderLength = getCylinderDimension(input, "length");

        double cylinderArea = computeCylinderArea(cylinderRadius);

        double cylinderVolume = computeCylinderVolume(cylinderArea, cylinderLength);

        System.out.printf("The area of the cylinder is: %.2f%n", cylinderArea);
        System.out.printf("The volume of the cylinder is: %.2f%n", cylinderVolume);

        input.close();
    }
}



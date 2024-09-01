package NKP_ALL_LAB_Problem;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        // Input coefficients a, b, c
        System.out.print("Enter coefficient a: ");
        double a=scanner.nextDouble();
        System.out.println("Enter coefficient b");
        double b=scanner.nextDouble();
        System.out.println("Enter coefficient c");
        double c=scanner.nextDouble();

        solveQuadratic(a, b, c, 0);



    }
    public static void solveQuadratic(double a, double b, double c, int step) {
        if (step == 0) {
            // Calculate the discriminant
            double discriminant = calculateDiscriminant(b, a, c, step);
            solveQuadratic(a, b, c, 1);
        } else if (step == 1) {
            // Calculate roots based on discriminant
            calculateRoots(a, b, c);
        }
    }
    public static double calculateDiscriminant(double b, double a, double c, int step) {
        if (step == 0) {
            return (b * b) - (4 * a * c);
        }
        return 0;
    }

    // Method to calculate roots based on discriminant
    public static void calculateRoots(double a, double b, double c) {
        double discriminant = calculateDiscriminant(b, a, c, 0);

        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The root is real and repeated:");
            System.out.println("Root: " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}

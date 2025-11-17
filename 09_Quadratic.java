import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        System.out.println("\nSolving equation: " + a + "x² + " + b + "x + " + c + " = 0");

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real solutions:");
            System.out.println("x₁ = " + root1);
            System.out.println("x₂ = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real solution:");
            System.out.println("x = " + root);
        } else {
            System.out.println("No real solutions. Discriminant is negative.");
        }

        input.close();
    }
}

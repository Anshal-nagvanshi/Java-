import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        int meters = input.nextInt();

        int feet = meters * 3;

        System.out.println(meters + " meter(s) = " + feet + " feet");

        input.close();
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter second numbers: ");
        int b = sc.nextInt();
        System.out.println("sum of two numbers: "+ (a+b));
        System.out.println("substraction of two numbers: "+ (a-b));
        System.out.println("multiplication of two numbers: "+ (a*b));
        System.out.println("division of two numbers: " +(a/b));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.:  ");
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter second no.: ");
        int b = sc1.nextInt();
        System.out.println("difference "+(a-b));
        System.out.println("addition "+(a+b));
        System.out.println("product "+(a*b));
        System.out.println("division "+(a/b));  
        
       
    }
}

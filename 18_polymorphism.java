class SumDemo {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }

    double sum(int a, double b) {
        return a + b;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        SumDemo obj = new SumDemo();

        System.out.println("Sum of 2 integers: " + obj.sum(5, 10));
        System.out.println("Sum of 3 integers: " + obj.sum(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + obj.sum(2.5, 3.5));
        System.out.println("Sum of int + double: " + obj.sum(10, 4.5));
    }
}

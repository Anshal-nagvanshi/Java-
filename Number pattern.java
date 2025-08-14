public class NumberPattern {
    public static void main(String[] args) {
        int a = 3, b = 7, c = 10;

        if (a != b && b != c && a != c) {
            if (a < b && b < c) {
                System.out.println("Strictly Increasing");
            } else if (a > b && b > c) {
                System.out.println("Strictly Decreasing");
            } else if (b > a && b > c) {
                System.out.println("Middle number is largest");
            } else {
                System.out.println("No specific pattern");
            }
        } else {
            System.out.println("Numbers are not all different");
        }
    }
}

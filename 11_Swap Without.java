public class SwapWithout {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;  
        b = a - b;  
        a = a - b;  
        System.out.println("After swap (without 3rd variable): a = " + a + ", b = " + b);
    }
}

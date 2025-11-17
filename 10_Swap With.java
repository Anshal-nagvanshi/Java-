public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a; 
        a = b;        
        b = temp;  
        System.out.println("After swap (with 3rd variable): a = " + a + ", b = " + b);
    }
}

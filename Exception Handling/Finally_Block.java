// Use finally block

public class Finally_Block {
    public static void main(String args[]) {
        int a = 10, b = 10, d, c[] = { 1, 2, 3 };
        System.out.println("Start Program");
        try {
            d = a / b;
            System.out.println(d);
            System.out.println(c[3]);
        } catch (ArithmeticException e) {
            System.out.println("dont divid zero");
        } finally {
            System.out.println("finally block");
        }
    }
}

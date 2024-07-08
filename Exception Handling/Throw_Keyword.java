//use throw keyword for changing message 

public class Throw_Keyword {
    public static void main(String args[]) {
        int a = 10, b = 1, c;
        System.out.println("throw keyword");
        try {
            if (b == 1) {
                throw new ArithmeticException("/ by one");
            } else {
                c = a / b;
                System.out.println(c);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("throw keyword");
    }
}

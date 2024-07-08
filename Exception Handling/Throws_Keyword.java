// user throws keyword

public class Throws_Keyword {
    void div(int a, int b) throws ArithmeticException {
        int c;
        if (b == 1) {
            throw new ArithmeticException("/ by one");
        } else {

            c = a / b;
            System.out.println(c);
        }
    }

    public static void main(String ar[]) {
        Throws_Keyword e1 = new Throws_Keyword();

        try {
            e1.div(10, 0);
            e1.div(10, 1);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        try {
            e1.div(10, 1);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("bye");
    }

}

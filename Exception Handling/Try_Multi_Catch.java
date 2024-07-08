// Single try Multiple catch block

public class Try_Multi_Catch {
    public static void main(String args[]) {
        int a = 10, b = 10, d, c[] = { 1, 2, 3 };
        System.out.println("Exception handling");
        try {
            d = a / b;
            System.out.println(d);
            System.out.println(c[3]);
        } catch (ArithmeticException e) {
            System.out.println("dont divid zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index invailed");
        }
        System.out.println("Exception handling");
    }
}

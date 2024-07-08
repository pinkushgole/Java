// Single try with single catch block 
public class Try_Catch {
    public static void main(String args[]) {
        int a = 10, b = 0;
        System.out.println("Start Exception Handling");
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("dont divid zero");
        }
        System.out.println("End Exception Handlind");
    }

}
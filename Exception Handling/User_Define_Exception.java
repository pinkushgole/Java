
class ExceptionHandling extends Exception {
    String st;

    ExceptionHandling(String s) {
        st = s;
    }

    public String toString() {
        return "ExceptionHandling : " + st;
    }
}

public class User_Define_Exception {
    public static void main(String bca[]) {
        int a = 10, b = 1, c;
        try {
            if (b == 1) {
                throw new ExceptionHandling("/ by one");
            } else {
                c = a / b;
                System.out.println(c);
            }
        } catch (ExceptionHandling e) {
            System.out.println(e);
        }
        System.out.println("bye");
    }
}

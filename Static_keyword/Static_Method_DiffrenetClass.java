// static method and static block in deffrent classes

package Static_keyword;

class Static4 {
    static int a = 10;

    static void show() {
        System.out.println(a + 5);
    }

    static {
        a = a * 15;
        System.out.println("hyy: " + a);
    }
}

public class Static_Method_DiffrenetClass {
    public static void main(String bca[]) {
        System.out.println("hello");
        System.out.println(Static4.a);
        Static4.show();
        System.out.println(Static4.a);
    }
}

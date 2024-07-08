// use static method and static block
package Static_keyword;

public class Static_Block {
    static int a = 10;

    static void show() {
        System.out.println(a + 5);
    }

    static {
        a = a * 15;
        System.out.println(a);
    }

    public static void main(String bca[]) {
        System.out.println("hello");
        System.out.println(a);
        show();
        System.out.println(a);
    }
}

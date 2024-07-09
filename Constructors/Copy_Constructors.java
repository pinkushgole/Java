// copy constructor

package Constructors;

public class Copy_Constructors {
    int a, b, c;

    Copy_Constructors() {
    }

    Copy_Constructors(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    Copy_Constructors(Copy_Constructors c1) {
        a = c1.a;
        b = c1.b;
        c = c1.c;
    }

    void show() {
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String bca[]) {
        Copy_Constructors c = new Copy_Constructors(10, 20, 30);
        Copy_Constructors c1 = new Copy_Constructors(100, 200, 300);
        c.show();
        c1.show();
        Copy_Constructors c2 = new Copy_Constructors(c1);
        c2.show();
    }
}

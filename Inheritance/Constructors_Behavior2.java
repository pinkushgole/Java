// check of behavior of parameterize constructor with SUper()

package Inheritance;

class A {
    A(int x, int y) {
        System.out.println("hello class A" + x + " " + y);
    }
}

class B extends A {
    B(int a, int b, int c) {
        super(a, b);
        System.out.println("hello class B" + a + " " + b + " " + c);
    }
}

public class Constructors_Behavior2 {
    public static void main(String bca[]) {
        A a1 = new A(10, 20);
        B b1 = new B(100, 200, 300);

    }
}

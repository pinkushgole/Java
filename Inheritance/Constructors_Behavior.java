// check of behavior of constructor

package Inheritance;

class A {
    int a;

    A() {
        System.out.println("hello class A");
    }
}

class B extends A {
    int a1;

    B() {
        System.out.println("hello class B");
    }
}

public class Constructors_Behavior {
    public static void main(String bca[]) {

        B b1 = new B();
    }
}

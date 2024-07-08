// multilevel inheritance in java

package Inheritance;

class A {
    void show() {
        System.out.println("Hello from class A");
    }
}

class B extends A {
    void show1() {
        System.out.println("Hello from class B");
    }
}

class C extends B {
    void show2() {
        System.out.println("Hello from class C");
    }
}

public class Multilevel_Inheritance {
    public static void main(String bca[]) {
        A a1 = new A();
        a1.show();

        B b1 = new B();
        b1.show1();
        b1.show();

        C c = new C();
        c.show();
        c.show1();
        c.show2();
    }
}

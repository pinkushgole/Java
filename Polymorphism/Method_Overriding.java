//method overriding anlso called runtion Polymorphism

package Polymorphism;

class A {
    void show() {
        System.out.println("hello class A");
    }
}

class B extends A {
    void show() {
        System.out.println("hello class B");
    }
}

class C extends A {
    void show() {
        System.out.println("hello class c");
    }
}

public class Method_Overriding {
    public static void main(String bca[]) {
        A a1;
        B b1 = new B();
        C c1 = new C();
        a1 = b1;
        a1.show();
        a1 = c1;
        a1.show();

    }
}

// single level inheritance

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

public class Single_Level_Inheritance {
    public static void main(String bca[]) {
        A a1 = new A();
        B b1 = new B();
        a1.show();
        b1.show1();
        b1.show();
    }

}

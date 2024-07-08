package Abstract_Keyword;

abstract class A {
    abstract void disp();

    void show() {
        System.out.println("hello class A");
    }
}

class B extends A {
    void disp() {
        System.out.println("hello class B");
    }
}

public class Abstract_Class {
    public static void main(String bca[]) {
        // A a1=new A();
        B b1 = new B();
        b1.show();
        b1.disp();
    }
}

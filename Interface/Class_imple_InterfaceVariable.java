// multipale variable in diffrent interface

package Interface;

interface First {
    int a = 10;

    void show();
}

interface Second {
    int b = 20;

    void show1();
}

class A implements First, Second {
    public void show() {
        System.out.println("hello from show");
    }

    public void show1() {
        System.out.println("hello from show1");
    }

    public void add() {
        System.out.println(First.a);
        System.out.println(Second.b);
    }
}

public class Class_imple_InterfaceVariable {
    public static void main(String args[]) {
        A a1 = new A();
        a1.show();
        a1.show1();
        a1.add();
    }
}

//class extends class implements

package Interface;

interface First {
    void show();
}

interface Second {
    void show1();
}

class B {
    void add() {
        System.out.println("hello from B");
    }
}

class A extends B implements First, Second {
    public void show() {
        System.out.println("hello from show");
    }

    public void show1() {
        System.out.println("hello from show1");
    }

}

public class Class_Eclass_IInterface {
    public static void main(String args[]) {
        A a1 = new A();
        a1.show();
        a1.show1();
        a1.add();
    }
}

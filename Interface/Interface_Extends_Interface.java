// interface implement another interface

package Interface;

interface First {
    void show();
}

interface Second extends First {
    void show1();
}

class A extends B implements Second {
    public void show() {
        System.out.println("hello from show");
    }

    public void show1() {
        System.out.println("hello from show1");
    }
}

public class Interface_Extends_Interface {
    public static void main(String args[]) {
        A a1 = new A();
        a1.show();
        a1.show1();
    }
}

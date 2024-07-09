// class implements multipale interface

package Interface;

interface first {
    void show();
}

interface second {
    void show1();
}

class A implements first, second {
    public void show() {
        System.out.println("hello from show");
    }

    public void show1() {
        System.out.println("hello from show1");
    }
}

public class Class_Imple_MultiInterface {

    public static void main(String args[]) {
        A a1 = new A();
        a1.show();
        a1.show1();
    }
}

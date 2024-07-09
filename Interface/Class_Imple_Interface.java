//class implements interface

package Interface;

interface first {
    void show();
}

class A implements first {
    public void show() {
        System.out.println("hello from A");
    }
}

class Class_Imple_Interface {

    public static void main(String a[]) {

        A a1 = new A();
        a1.show();
    }
}
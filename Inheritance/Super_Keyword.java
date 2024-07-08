// use of super keywords

package Inheritance;

class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    void show1() {
        int a = 5;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

public class Super_Keyword {
    public static void main(String bca[]) {
        B b1 = new B();
        b1.show1();
    }
}

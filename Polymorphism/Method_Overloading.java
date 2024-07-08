// method overloading called compiletime Polymorphism

package Polymorphism;

public class Method_Overloading {
    void add() {
        System.out.println("hello");
    }

    void add(int p, int q) {
        System.out.println(p + q);
    }

    void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public static void main(String bca[]) {
        Method_Overloading m1 = new Method_Overloading();
        m1.add();
        m1.add(1, 4);
        m1.add(1, 2, 3);
        m1.add(1, 2, 36, 1);
    }

}

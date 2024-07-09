// one placeholder in genric class
package Generics_Class;

class Gen<T> {
    T a1;

    Gen(T temp) {
        a1 = temp;
    }

    void show() {
        System.out.println(a1);
        System.out.println(a1.getClass());
    }
}

public class Generics {
    public static void main(String rgs[]) {
        Gen<Integer> g1 = new Gen<Integer>(12);
        g1.show();
    }
}

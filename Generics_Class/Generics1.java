// multiple placeholder in genric class

package Generics_Class;

class Gen2<T, P> {
    T a1;
    P a2;

    Gen2(T temp, P temp1) {
        a1 = temp;
        a2 = temp1;
    }

    void show() {
        System.out.println(a1);
        System.out.println(a1.getClass());
        System.out.println(a2);
    }
}

public class Generics1 {
    public static void main(String rgs[]) {
        Gen2<Integer, String> g1 = new Gen2<Integer, String>(12, "pinkush");
        g1.show();
    }
}

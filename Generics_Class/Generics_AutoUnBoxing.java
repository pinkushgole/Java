// AutoUnBoxing in genric class

package Generics_Class;

class GenAutoUnBoxing<T> {
    T a1;

    GenAutoUnBoxing(T temp) {
        a1 = temp;
    }

    T show() {
        return a1;
    }
}

public class Generics_AutoUnBoxing {
    public static void main(String rgs[]) {
        GenAutoUnBoxing<Integer> g1 = new GenAutoUnBoxing<Integer>(10);
        int x = g1.show();
        System.out.println(x);
    }
}

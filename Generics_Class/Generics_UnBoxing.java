// UnBoxing in genric class

package Generics_Class;

class GenUnBoxing<T> {
    T a1;

    GenUnBoxing(T temp) {
        a1 = temp;
    }

    T show() {
        return a1;
    }
}

public class Generics_UnBoxing {
    public static void main(String rgs[]) {
        GenUnBoxing<Integer> g1 = new GenUnBoxing<Integer>(10);
        Integer x = g1.show();
        System.out.println(x);
    }
}

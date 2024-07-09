// Boxing in genric class

package Generics_Class;

class GenBoxing<T> {
    T a1;

    GenBoxing(T temp) {
        a1 = temp;
    }

    T show() {
        return a1;
    }
}

public class Generics_Boxing {

    public static void main(String rgs[]) {
        GenBoxing<Integer> g1 = new GenBoxing<Integer>(12);
        g1.show();
    }
}
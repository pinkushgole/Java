// AutoBoxing in genric class

package Generics_Class;

class GenAutoBoxing<T> {
    T a1;

    GenAutoBoxing(T temp) {
        a1 = temp;
    }

    T show() {
        return a1;
    }
}

public class Generics_AutoBoxing {
    public static void main(String rgs[]) {
        int a = 18;
        GenAutoBoxing<Integer> g1 = new GenAutoBoxing<Integer>(a);
        g1.show();
    }
}

//final keyword with final variable

package Final_Keyword;

class Inheritance {
    final int a = 10;

    void show() {
        // a++; // error in this line
        System.out.println(a);
    }
}

public class Final_Variable {

    public static void main(String bca[]) {
        Inheritance i1 = new Inheritance();
        i1.show();
    }
}

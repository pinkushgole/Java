// perameterized constructor
package Constructors;

public class Paeameterizes_Contsructor {
    int a, b, c;

    Paeameterizes_Contsructor() {

    }

    Paeameterizes_Contsructor(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void show() {
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Paeameterizes_Contsructor p = new Paeameterizes_Contsructor(10, 20, 30);
        Paeameterizes_Contsructor p2 = new Paeameterizes_Contsructor();
        p.show();
        p2.show();
    }

}

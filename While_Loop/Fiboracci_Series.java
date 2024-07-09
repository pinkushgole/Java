// fiboracci series

package While_Loop;

public class Fiboracci_Series {
    public static void main(String bca[]) {
        int a = 0, b = 1, c, i = 1, n = 7;
        /*
         * System.out.print(a+" "+b+" ");
         * while(i<=(n-2))
         * {
         * c=a+b;
         * System.out.print(c+" ");
         * a=b;
         * b=c;
         * i++;
         * }
         */
        while (i <= n) {
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
            i++;
        }
    }
}

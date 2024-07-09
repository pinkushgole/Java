
package While_Loop;

public class Reverse_Number {
    public static void main(String bca[]) {

        // print reverce number
        int n = 153, r;
        while (n != 0) {
            r = n % 10;
            System.out.print(r);
            n = n / 10;
        }

        // print reverce number
        int n1 = 153, r1, sum = 0;
        while (n1 != 0) {
            r1 = n1 % 10;
            sum = sum * 10 + r1;
            n1 = n1 / 10;
        }
        System.out.println(sum);

    }
}

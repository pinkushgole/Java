package While_Loop;

public class While_Loop_Use {

    public static void main(String bca[]) {
        // print 1 2 3 4 5 6 7 8 9 10
        int i = 1;
        while (i <= 10) {
            System.out.print(i + "\t");
            i++;
        }

        // print 1 4 9 16 25 36 49 64 81 100
        int j = 1;
        while (j <= 10) {
            System.out.print((j * j) + "\t");
            j++;
        }

        // print 1/1 2/4 3/9 4/16 5/25 6/36 7/49 8/64 9/81 10/100
        int k = 1;
        while (k <= 10) {
            System.out.print(k + "/" + (k * k) + "\t");
            k++;
        }

        // print 1/1+2/4+3/9+4/16+5/25+6/36+7/49+8/64+9/81+10/100
        int m = 1;
        while (m < 10) {
            System.out.print(m + "/" + (m * m) + "+");
            m++;
        }
        System.out.print(m + "/" + (m * m));

    }
}

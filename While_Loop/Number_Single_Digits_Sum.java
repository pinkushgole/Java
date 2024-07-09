// sum of single digit given num
package While_Loop;

public class Number_Single_Digits_Sum {

    public static void main(String as[]) {
        int n = 153, r, sum = 0;
        while (n != 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println(sum);
    }
}

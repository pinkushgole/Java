// number is palindrome or not

package While_Loop;

public class Polindrome_Number {
    public static void main(String bca[]) {
        int n = 353, r, sum = 0;
        int t = n;
        while (n != 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if (sum == t)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }
}

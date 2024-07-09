// number is armstrong or not 1 to 1000

package While_Loop;

public class ArmStrong_Number {
    public static void main(String bca[]) {
        int n = 153, r, sum = 0, temp = n;

        while (n != 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (sum == temp)
            System.out.println("number is armstrong");
        else
            System.out.println("number is not armstrong");
    }
}

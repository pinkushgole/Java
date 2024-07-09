package While_Loop;

public class Factorial {
    public static void main(String bca[]) {
        int n = 5, f = 1;
        while (n > 1) {
            f = f * n;
            n--;
        }
        System.out.println(f);
    }
}

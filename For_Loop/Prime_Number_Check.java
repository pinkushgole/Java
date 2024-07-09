package For_Loop;

public class Prime_Number_Check {
    public static void main(String bca[]) {
        int n = 7, i;
        boolean f = false;
        for (i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                f = true;
                break;
            }
        }
        if (f)
            System.out.println("non prime");
        else
            System.out.println("prime");
    }
}

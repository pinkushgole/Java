package Arrays;

import java.util.Scanner;

public class Arrays_Basic {

    public static void main(String bca[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

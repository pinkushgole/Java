package Arrays;

public class Min_Value {
    public static void main(String bca[]) {
        int a[] = { 50, 60, 40, 70, 20, 30, 10, 100, 80, 90 };
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}

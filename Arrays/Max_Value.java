package Arrays;

public class Max_Value {
    public static void main(String bca[]) {
        int a[] = { 50, 60, 40, 70, 20, 30, 10, 100, 80, 90 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
    }
}

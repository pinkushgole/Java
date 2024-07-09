package Arrays;

public class Sum_All_Elements {
    public static void main(String bca[]) {
        int a[] = { 10, 20, 30, 40, 50 }, sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}

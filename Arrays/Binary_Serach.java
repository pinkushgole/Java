package Arrays;

public class Binary_Serach {
    public static void main(String bca[]) {
        int a[] = { 50, 60, 70, 40, 20, 30, 10, 100, 80, 89 }, i, j, temp, low = 0, high = a.length - 1, mid, n = 80;
        boolean f = false;
        for (i = 0; i < a.length - 1; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        while (low <= high) {
            mid = (low + high) / 2;
            if (low <= high) {
                f = true;
                break;
            } else if (n > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (f)
            System.out.println("element found");
        else
            System.out.println("element not found");

    }
}

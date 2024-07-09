package Arrays;

public class Array_As_Argument {
    void add(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }

    void min(int a[]) {
        int mini = a[0];
        for (int i = 1; i < a.length; i++) {
            if (mini > a[i]) {
                mini = a[i];
            }
        }
        System.out.println(mini);
    }

    void max(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }

    void sort(int a1[]) {
        int temp;
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] > a1[j]) {
                    temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                }
            }
        }

    }

    boolean Search(int a1[], int key) {
        boolean f = false;
        for (int i = 0; i < a1.length; i++) {
            if (key == a1[i]) {
                f = true;
                break;
            }
        }
        return f;
    }

    public static void main(String bca[]) {
        Array_As_Argument a1 = new Array_As_Argument();
        int a[] = { 10, 20, 30, 40, 50 };
        int b[] = { 10, 42, 3, 4, 51, 61, 27, 8, 9, 1 };
        a1.add(a);
        a1.min(b);
        a1.max(a);
        if (a1.Search(a, 51)) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }
        a1.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

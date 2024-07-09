package Arrays;

public class Linear_Serach {
    public static void main(String bca[]) {
        int a[] = { 50, 60, 40, 70, 20, 30, 10, 100, 80, 90 };
        int n = 80;
        boolean f = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println("element found");
        } else {
            System.out.println("element found");
        }

        // liner search for each loop

        // int a[]={50,60,40,70,20,30,10,100,80,90};
        // int n=80;
        // boolean f=false;
        // for(int i:a)
        // {
        // if(i==n)
        // {
        // f=true;
        // break;
        // }
        // }
        // if(f)
        // { System.out.println("element found");}
        // else
        // { System.out.println("element found");}
        // }
    }
}

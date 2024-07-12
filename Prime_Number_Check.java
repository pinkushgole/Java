public class Prime_Number_Check {

    public static void main(String ar[]) {
        int number = 7;
        boolean f = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println("number is not prime");
        } else {
            System.out.println(" number is prime");
        }
    }

}
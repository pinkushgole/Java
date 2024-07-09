package For_Loop;

public class For_Loop_Pattern1 {

    public static void main(String a[]) {

        int i, j;

        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         */
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         * 5
         * 5 4
         * 5 4 3
         * 5 4 3 2
         * 5 4 3 2 1
         */
        for (i = 5; i >= 1; i--) {
            for (j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * 5
         * 4 4
         * 3 3 3
         * 2 2 2 2
         * 1 1 1 1 1
         */
        for (i = 5; i >= 1; i--) {
            for (j = 5; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * 1 1 1 1 1
         * 2 2 2 2
         * 3 3 3
         * 4 4
         * 5
         */
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         * 5 4 3 2 1
         * 5 4 3 2
         * 5 4 3
         * 5 4
         * 5
         */
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * 5 5 5 5 5
         * 4 4 4 4
         * 3 3 3
         * 2 2
         * 1
         */
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         * A
         * A B
         * A B C
         * A B C D
         * A B C D E
         */
        // char i, j;
        for (i = 'A'; i <= 'E'; i++) {
            for (j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * A
         * B B
         * C C C
         * D D D D
         * E E E E E
         */
        for (i = 'A'; i <= 'E'; i++) {
            for (j = 'A'; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         * E
         * E D
         * E D C
         * E D C B
         * E D C B A
         */
        for (i = 'E'; i >= 'A'; i--) {
            for (j = 'E'; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * E
         * D D
         * C C C
         * B B B B
         * A A A A A
         */
        for (i = 'E'; i >= 'A'; i--) {
            for (j = 'E'; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         * A B C D E
         * A B C D
         * A B C
         * A B
         * A
         */
        for (i = 'E'; i >= 'A'; i--) {
            for (j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * A A A A A
         * B B B B
         * C C C
         * D D
         * E
         */
        for (i = 'A'; i <= 'E'; i++) {
            for (j = 'E'; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         * E D C B A
         * E D C B
         * E D C
         * E D
         * E
         */
        for (i = 'A'; i <= 'E'; i++) {
            for (j = 'E'; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * E E E E E
         * D D D D
         * C C C
         * B B
         * A
         */
        for (i = 'E'; i >= 'A'; i--) {
            for (j = 'A'; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        // char i,j;
        char k;
        for (i = 1; i <= 5; i++) {
            for (k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *
         * * *
         * * * * *
         * * * * * * *
         * * * * * * * * *
         */
        // char i,j,k;
        for (i = 1; i <= 5; i++) {
            for (k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         */
        // int i,j;
        int b = 1;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(b + " ");
                ++b;
            }
            System.out.println();
        }
    }

}

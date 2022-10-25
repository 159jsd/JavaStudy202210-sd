package j07_반복;

public class Star {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            int k = 10 - i;
            for (int j = 0; j < k ; j++) {

                System.out.print("*");

            }
            System.out.println();

        }

        for (int i = 0; i < 10; i++) {
            int k = 9 - i;
            for (int j = 0; j < k ; j++) {

                System.out.print(" ");

            }
            for (int j = 0; j < i + 1 ; j++) {

                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = 0; i < 10; i++) {
            int k = 10 - i;
            for (int j = 0; j < i ; j++) {

                System.out.print(" ");

            }
            for (int j = 0; j < k ; j++) {

                System.out.print("*");
            }

            System.out.println();

        }









    }
}

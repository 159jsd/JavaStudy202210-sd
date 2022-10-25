package j07_반복;

import java.util.Scanner;

public class Loop7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isEmpty = true;

        while (isEmpty) {
            System.out.print("숫자를 입력하세요: ");
            int name = scanner.nextInt();
            if (name != 0) {
                isEmpty = false;
            }
        }

    }
}

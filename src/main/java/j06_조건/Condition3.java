package j06_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;          // 시험 점수
        String grade = null;    // 학점

        System.out.print("점수를 입력하세요: ");
        score = scanner.nextInt();

        //조건
        /*
        score가 0보다 작거나 100보다 크면 grade는 X
        90 ~ 100 A학점
        80 ~ 89 B학점
        70 ~ 79 C학점
        60 ~ 69 D학점
        0  ~ 59 F학점
         */
        if (score > 100 || score < 0) {
            grade = "X";
        }
        else if (score > 89) {
            grade = "A";
        }
        else if (score > 79) {
            grade = "B";
        }
        else if (score > 69) {
            grade = "C";
        }
        else if (score > 59) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println("입력한 점수는 " + score + "점 이며 학점은 " + grade + "학점 입니다.");
    }
}

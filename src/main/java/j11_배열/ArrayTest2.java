package j11_배열;

import java.util.Scanner;

public class ArrayTest2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentNames[] = new String[sc.nextInt()];
        sc.nextLine();

        /* studentNames[0] = "정빈";
        studentNames[1] = "김규민";
        studentNames[2] = "박경호";
        studentNames[3] = "김혜진";
        studentNames[4] = "김지향";
        studentNames[5] = "전병욱";
        studentNames[6] = "윤도영";
        studentNames[7] = "이성욱";
        studentNames[8] = "홍성욱";
        studentNames[9] = "박민화";

        System.out.println("출력결과");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". "+studentNames[i]);
        }
        */

        for (int i = 0; i < studentNames.length; i++) {
            System.out.print((i+1)+"번째 학생 이름 입력 :");
            studentNames[i] = sc.nextLine();
        }
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println((i+1)+"."+studentNames[i]);
        }



    }


}


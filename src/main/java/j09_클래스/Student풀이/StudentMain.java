package j09_클래스.Student풀이;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Student ji  = new Student();
        Student gd = new Student();

        ji.name = "김준일";
        ji.studentYear = 2;
        ji.studentCode = 20220001;
        ji.schoolName = "부산대학교";

        gd.name = "홍길동";
        gd.studentYear = 1;
        gd.studentCode = 20220002;
        gd.schoolName = "부경대학교";

        ji.showStudentInfo();
        gd.showStudentInfo();
        Scanner s = new Scanner(System.in);
        System.out.print("원하는 학년 숫자 입력 : ");
        ji.increaseStudentYear(s.nextInt());

    }
}

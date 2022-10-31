package j11_배열.studentManagement;

import java.util.Scanner;

public class StudentManagementApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentservice = new StudentService(scanner, new StudentRepository());

        String select = null;

        while (true) {
            System.out.println("[학생 관리 프로그램 메뉴]");
            System.out.println("1. 학생 전체 조회");
            System.out.println("2. 학생 등록");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 학생 정보 이름으로 조회");
            System.out.println("q. 종료");
            System.out.print("메뉴 선택 : ");
            select = scanner.nextLine();
            System.out.println();
            if(select.equals("q")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (select.equals("1")) {
                studentservice.showStudents();
            }
            else if (select.equals("2")) {
                studentservice.registerStudent();
            }
            else if (select.equals("3")) {
               studentservice.modifyStudent();
            }
            else if (select.equals("4")) {
                studentservice.deleteStudent();
            }
            else if (select.equals("5")) {
                studentservice.showStudent();
            }
            else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
            System.out.println();
            System.out.println();
            System.out.println();

        }

    }
}

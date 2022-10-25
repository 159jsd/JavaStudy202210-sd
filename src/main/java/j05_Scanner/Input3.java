package j05_Scanner;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        /*
            이름 : 김준일              name
            나이 : 29                 age
            주소 : 부산 동래구 사직동    address
            연락처 : 010 9988 1916    phone

            사용자의 이름은 김준일이고 나이는 29입니다.
            주소는 부산 동래구 사직동이며 연락처는 010 9988 1916 입니다.
        */

        /*
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = s.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = s1.nextInt();

        System.out.print("주소를 입력하세요 : ");
        String address = s.nextLine();

        System.out.print("연락처를 입력하세요 : ");
        String phone = s.nextLine();

        System.out.println("사용자의 이름은 "+name+"이고 나이는 "+age+"입니다.");

        System.out.println("주소는 "+address+"이며 연락처는 "+phone+"입니다.");
        */

        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String address = null;
        String phone = null;

        System.out.print("이름: ");
        name = scanner.next();

        System.out.print("나이: ");
        age = scanner.nextInt();

        System.out.print("주소: ");
        scanner.nextLine();
        address = scanner.nextLine();

        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "입니다.");

        System.out.println("주소는 " + address + "이며 연락처는 " + phone + "입니다.");

        //Scanner에서 buffer : 키보드 입력을 한번에 받기 위한 대기시간
        //next() : 스페이스바나 엔터를 허용하지 않음. 입력이 안됨
        //nextLine() : 스페이스바나 엔터를 허용함. 입력이 됨

    }
}
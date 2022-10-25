package j01_출력;

public class PrintTest1 {
    public static void main(String[] args) {
        //한줄 주석처리

        /*
        여러줄 주석처리
         */

        /** ->설명이라는 뜻.
         *
         * 클래스 또는 메소드의 역할을 명시 또는 설명하기 위한 주석처리.
         */

        //문자열 출력
        System.out.print("이름 : ");
        System.out.println("정순동");
        System.out.print("주소 : ");
        System.out.println("부산 동래구 사직동");
        //변수명 제약사항
        //1. 변수 이름은 대소문자를 구분하며 특수문자는 $,_만 사용가능함
        //2. 변수 이름은 숫자로 시작할 수 없다.
        //3. 자바에서 이미 사용 중인 예약어는 사용할 수 없다. ex) int while; -> X!

        //int a;
        //a = 100;
        //혹은 int a = 100;

        //자료형 앞에 final 을 붙히면 상수로 변한다. ex) final int a = 100;
        //리터럴 =


        boolean isUsernameCheckFlag = true;
    }
}

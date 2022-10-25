package j02_변수상수;

/* 변수 */
public class Variable {
    public static void main(String[] args) {

        System.out.println("------'변수'------");
        //boolean 논리 자료형 : 참인지 거짓인지 저장
        boolean checkFlag = false;
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);
        System.out.println("");

        //character 문자 자료형 : 문자값 1개를 저장
        char name1 = '김';
        char name2 = '준';
        char name3 = '일';
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("" + name1 + name2 + name3);
        System.out.println('가' + 0);
        int a = '가' + 0; //AC00 = 44032
        System.out.println("");

        //String 문자 자료형 : 문자열 값을 저장
        String name = "김준일";
        System.out.println(name);
        String name4 = "윤도영";
        String name5 = name + name4;
        System.out.println(name5);
        System.out.println("");

        //Integer 정수 자료형 : 정수로 된 값을 저장
        int width = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width2;
        String widthResult2 = width3 + width4;

        System.out.println(widthResult); //정수형 값이기 떄문에 300+400 = 700으로 나온다.
        System.out.println(widthResult2); //문자열 값이기 때문에 "300" + "400" = "300400"으로 나온다.

        long time = System.currentTimeMillis(); // 1970년1월1일 00시00분 부터 몇초 지났는지 알려주는 명령어.
        System.out.println(time/(24*60*60*1000)); // 1970년1월1일 이후 19284일이 지남

        long time2 = 1666178885589L;
        System.out.println(time2);
        System.out.println("");

        //Double Float 실수 자료형 : 실수로 된 값을 저장
        double pi = 30000000.141592653599999999999; //E뒤에 붙은 숫자만큼 .앞에 0을 붙히면 된다.
        System.out.println(pi);
        System.out.println("");

        //final 상수로 된 자료형 : final을 사용해 값을 바꿀수 없는 상수로서 자료형을 저장한다
        final String FILE_PATH = "C:/Users/junil"; //상수로저장 된 값들의 이름은 대문자로 적는다.
        //FILE_PATH = "다른거"; -> 상수 값이라 다시 바꿀수 없음
        System.out.println(FILE_PATH);




    }
}

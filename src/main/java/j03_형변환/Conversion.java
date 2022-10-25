package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        //upcasting 업캐스팅 (묵시적 형변환)
        char cast1 = 'a';
        System.out.println((int) cast1);
        int cast2 = (int)cast1; //(int) 생략가능
        System.out.println(cast2);

        //downcasting 다운캐스팅 (명시적 형변환)
        int cast3 = 98;
        char cast4 = (char) cast3; //cast4 = b (char) 생략 불가능
        System.out.println(cast4);

        double cast5 = 3.14;
        int cast6 = (int)cast5; //소숫점 이후는 버리고 3만 들어감
        System.out.println(cast6);
        double cast7 = cast6; //3.14에서 .14를 버리고 3만 저장됐었기 때문에 cast7 = 3.0이다.
        System.out.println(cast7);
    }
}

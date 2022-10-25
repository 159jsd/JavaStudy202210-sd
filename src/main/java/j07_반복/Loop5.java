package j07_반복;
public class Loop5 {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            System.out.println("-----"+i+"단-----");
            for (int j = 1; j < 10; j++) {
                System.out.println(i+" x "+j+" = "+(i*j));
            }
        }
        //반복문 안에서 int index =+ i; 처럼 선언을 하더라도 선언자체가 반복되지는 않는다.
    }
}

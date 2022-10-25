package j04_연산자;

public class Operation2 {
    public static void main(String[] args) {
        /**
         *  <논리 연산자>
         *      True(1),False(0)
         *
         *      And(&&) -> 곱    T x T => T, T x F => F 두값모두 참이어야 결과가 참
         *      Or (||) -> 합    T + T => T, T + F => T 두값 중 하나가 참이면 결과가 참
         *      NOT (!) -> 부정   T => F, F => T 참이면 거짓, 거짓이면 참
         */

        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag2;
        System.out.println(result1);

        boolean result2 = flag1 || flag2;
        System.out.println(result2);

        System.out.println();

        boolean result4 = flag1 || flag1;
        System.out.println("T + T =>"+result4);

        boolean result5 = flag1 || flag2;
        System.out.println("T + F =>"+result5);

        boolean result6 = flag2 || flag2;
        System.out.println("F + F =>"+result6);

        System.out.println();

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F x T=>"+result7);

        boolean result8 = 10 % 3 != 0;
        System.out.println("10 % 3 !=0 =>"+result8);

        int year = 2022;
        boolean result9 = year % 2 == 0 && year % 300 != 0 || year % 100 ==0;
        System.out.println(result9);
    }
}

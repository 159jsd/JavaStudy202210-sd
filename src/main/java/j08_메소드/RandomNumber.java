package j08_메소드;

import java.util.Random;

public class RandomNumber {

    public static int calcRandom(int m) { //리턴 자료형
        Random random = new Random();

        int result = random.nextInt(10) * 1000 + m;

        return result;
    }


    public static void main(String[] args) {
//        Random random = new Random();

        int money = 5000;
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int r = calcRandom(money);

       /* int a = random.nextInt(10) * 1000 + money; //1000단위 랜덤 숫자
        int b = random.nextInt(10) * 1000 + money;
        int c = random.nextInt(10) * 1000 + money;
        int d = random.nextInt(10) * 1000 + money;*/

        /*for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(10)+10; //(bound:10) = 0 ~ 10 ,(bound:10)+10 = 10 ~ 20
            System.out.println(randNum);
        }
*/


    }
}

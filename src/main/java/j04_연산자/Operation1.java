package j04_연산자;

public class Operation1 {
    public static void main(String[] args) {
        //단항 연산자
        int num = 10;
        num = num + 1; //++num; num++; 이랑 같다.
        //++num; = 선증가, num++; = 후증가
        //--num; = 선감소, num--; = 후감소
        System.out.println(num);
        System.out.println(++num);
        System.out.println(num++); //num++ 는 출력 후 값을 더하기 때문에 12가 나온다.
        System.out.println(num); // 따라서 여기서 13이 출력됨.
        System.out.println(--num);
        System.out.println(num--);
        System.out.println(num);

        //관계 연산자
        /*
        x > y : x가 y보다 크면 true
        x < y : x가 y보다 작으면 true
        x >= y : x가 y보다 크거나 같으면 true
        x <= y : x가 y보다 작거나 같으면 true
        x == y : x와 y가 같으면 true
        x != y : x와 y가 같지않으면 true


         */
    }
}

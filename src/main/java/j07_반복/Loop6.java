package j07_반복;
public class Loop6 {
    public static void main(String[] args) {

        int n = 5;
        //일정한 간격을 기준으로 순차적으로 증가,감소시킬때는 for문
        for (int i = 0; i < n; i++) {
            System.out.println(i+1);
        }

        int i = 0;
        //(i < n) = 탈출 조건
        while (i < n)  {
            System.out.println(i++ + 1);
        }
    }
}

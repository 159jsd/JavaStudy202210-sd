package j07_반복;

public class Loop1 {
    public static void main(String[] args) {

        int total = 0;

        /*
        반복을 해라.
        i가 0 부터 100이 되기 전까지 i를 1씩 증시키면서 반복해라.
         */

        for (int i = 0; i < 100; i++) {
            total += i + 1;
            System.out.println("i = "+(i+1));
        }
        System.out.println("0부터 100까지의 합은 " + total + "입니다.");
    }
}

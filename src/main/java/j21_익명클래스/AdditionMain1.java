package j21_익명클래스;

public class AdditionMain1 {

    public static void main(String[] args) {
        Addition<String> stringAddition = new AdditionImpl<String>();

        String str = stringAddition.add("문자열");
        System.out.println(str);

        // 원래는 다른 클래스를 생산해서 implements를 해서 인터페이스를 적용 시킨다음 구연해서
        // 메인부분에서 불러온다음 interface의 메소드를 사용해야 하지만 밑에 처럼 1회용으로
        // 메인부분에서 바로 사용할수 있는 방법.

        Addition<Integer> integerAddition = new Addition<Integer>() {

            @Override
            public Integer add(Integer values) {
                return null;
            }
        };

    }



}

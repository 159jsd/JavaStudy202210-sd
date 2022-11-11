package j22_람다;

@FunctionalInterface
public interface Operation {
    public  int calc(int x, int y);

    // public  int calc2(int x, int y); 람다를 사용해서 구연하려면 메소드가 2개 이상이면 안된다.

    public default String printResult(int result){
        return "결과값 : " + result;
    }

    // default (기본) 메소드는 상관없다.
}

package j13_추상화.인터페이스;

public interface Press {

    public final String NAME = "button"; //상수는 선언 가능. (접근지정자 public으로 사용했을때만)

    public void onPressed();







//    public default void pop() {} - 일반 메소드 바꾸기
//    public Switch(); - interface는 생성자 정의 불가능
//    private String name; - 일반 변수도 선언 불가능.
}

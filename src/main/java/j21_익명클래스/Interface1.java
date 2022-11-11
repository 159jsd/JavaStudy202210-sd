package j21_익명클래스;

public interface Interface1 {

    public void methodName();
    public default void methodName2() {
        System.out.println("default로 구성된 Interface1 메소드 출력");
    }

}

package j12_상속;

public class Human extends Animal{

    public Human(String name) {
        super(name);                   //   ────────┓
        // super();는 원래 생략돼 있는것임.             이 둘의 위치는 바꿀 수 없다. 부모가 먼저 생성 되어야  하는데
        System.out.println("Human 생성"); // ────────┘ 매개변수 값이 없어서 생성이 안되기 때문이다.
    }
    //두개의 클래스가 붙어 있기 때문에 다른 클래스의 명령어도 사용할 수 있다.

    /*
    * 메소드 오버라이딩 (오버라이드)
    * [ 재정의 ]
    * 상위 객체의 메소드를 하위 객체에서 다시 정의하는 행위
    * 오버라이딩을 한 메소드는 @Override를 사용하여 해당 메소드가 상위 객체로부터 재정의된
    * 메소드라는 것을 알려주기 위해 표현하는것.
    * 오버라이드된 메소드 안에서 부모객체의 동일명 메소드를 실행하고 싶을땐 super.메소드명();를 이용한다.
    * */
    @Override //어노테이션이라고 한다.
    public void move() {
        System.out.println(super.getName() + "이 두 발로 걷습니다.");
    }











}

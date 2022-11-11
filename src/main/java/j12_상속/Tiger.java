package j12_상속;

public class Tiger extends Animal{

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(super.getName() + "가 네발로 뜁니다.");
    }
}

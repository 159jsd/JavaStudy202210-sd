package J14_참조자료형캐스팅;
// 중앙제어
public class CentralControl {
    // 인터페이스는 규격을 정할때 사용하는것, 콘센트에 html케이블을 사용할 수 없는것 처럼.
    private Power device1; //Power 인터페이스를 implements 한 객체면 무엇이든지 들어와도 된다.
    private Power device2; //Main.java 에서 CentralControl생성자에 computer가 들어가 있어서
    private Power device3; //컴퓨터의 전원을 켠다고 나온다.

    public CentralControl(Power device1, Power device2, Power device3) {
        this.device1 = device1;
        this.device2 = device2;
        this.device3 = device3;
    }

    public void powerOn() {
        device1.on();
        device2.on();
        device3.on();
    }

    public void powerOff() {
        device1.off();
        device2.off();
        device3.off();
    }






}

package j14_참조자료형캐스팅;
// 중앙제어
public class CentralControl {
    // 인터페이스는 규격을 정할때 사용하는것, 콘센트에 html케이블을 사용할 수 없는것 처럼.
    private Power device1; //Power 인터페이스를 implements 한 객체면 무엇이든지 들어와도 된다.
    private Power device2; //Main.java 에서 CentralControl생성자에 computer가 들어가 있어서
    private Power device3; //컴퓨터의 전원을 켠다고 나온다.

    private Power deviceArray[];

    public CentralControl(Power[] deviceArray) {
        this.device1 = device1;
        this.device2 = device2;
        this.device3 = device3;
    }

    public void addDevice(Power device) {
        int emptyIndex = checkEmpty();
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            System.out.println();
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        System.out.println();
      }

    private int checkEmpty() {
         for (int i = 0; i < deviceArray.length; i++) {
               if (deviceArray[i] == null) {
                   return i;
               }
         }
         return -1;
    }

    public void powerOn() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) continue;

            deviceArray[i].on();
        }
    }

    public void powerOff() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) continue;

            deviceArray[i].off();
        }
    }









}

package j09_클래스;

public class Constructor {

    //지역변수가 전역변수보다 우선순위가 높다.
    int num;
    String name;

    Constructor() {
        System.out.println("NoArgsConstructor(기본 생성자)");
    }
    Constructor(int num) {
        //num = num; 은 Constructor 매개변수인 num 에다가 num을 대입하는 꼴.
        this.num = num;
        System.out.println("RequiredArgsConstructor(int 매개변수(Argument)를 필수로하는 생성자)");
    }
    Constructor(String name) {
        this.name = name;
        System.out.println("RequiredArgsConstructor(String 매개변수(Argument)를 필수로하는 생성자)");
    }
    Constructor(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("AllArgsConstructor(전체 생성자)");
    }
    void showInfo() {
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }
}

package j21_익명클래스;

public class Main {

    public static void main(String[] args) {
        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();

        Class1 class1 = new Class1();

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();
        interface4.methodName();
        interface5.methodName();
        class1.methodName();
        Interface1 interface6 = new Interface1() {
            @Override
            public void methodName() {
                System.out.println("익명 클래스로 생성한 1회용 인터페이스");
            }
        };
        interface6.methodName();
        interface6.methodName2();



    }

}

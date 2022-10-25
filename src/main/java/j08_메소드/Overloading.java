package j08_메소드;

/*
* 메소드 오버로딩
* 매개변수의 형태가 다르면 동일한 매소드 명을 가지고 정의할 수 있다.
* */

public class Overloading {

    public static void add() {
        System.out.println("add()");
    }

    public static void add(int a) {
        System.out.println("add(1)");
    }

    public static void add(String s) {
        System.out.println("add(s)");
    }

    public static void add(int a, int b) {
        System.out.println("add(1, 2)");
    }

    public static void add(int a, String b) {
        System.out.println("add(1, b)");
    }

    public static void add(String b,int a ) {
        System.out.println("add(b, 1)");
    }

    public static void main(String[] args) {
        add();
        add(1);
        add("s");
        add(1, 2);
        add(1 ,"b");
        add("b",1);
    }
}

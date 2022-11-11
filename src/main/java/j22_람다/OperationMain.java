package j22_람다;

public class OperationMain {

    public static void main(String[] args) {

        Operation add = new Operation() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };

        Operation add2 = (int x, int y) -> {return x + y;};

        // ↓↓↓↓↓ 간소화, return을 없애려면 { }가없어야 한다, 매개변수도 하나라면 () 없애도 됨.
        Operation sub = (x, y) -> x - y;

        Operation multi = (x, y) -> x * y;

        Operation div = (x, y) -> x / y;

        int a = 10, b = 20;



        int addResult = add.calc(a, b);
        System.out.println(a + " + " + b + " = " + addResult);

        int addResult2 = add2.calc(a, b);
        System.out.println(a + " + " + b + " = " + addResult2);

        int subResult = sub.calc(b, a);
        System.out.println(b + " - " + a + " = " + subResult);


        System.out.println("빼기");
        System.out.println(sub.printResult(sub.calc(b, a)));
        System.out.println("곱하기");
        System.out.println(multi.printResult(multi.calc(a, b)));
        System.out.println("나누기");
        System.out.println(div.printResult(div.calc(b, a)));
    }

}

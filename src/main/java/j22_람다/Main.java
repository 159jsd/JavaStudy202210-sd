package j22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        // Runnable - return값이 없기때문에 {}가 필수임.
        Runnable runnable1 = () -> {
            System.out.println("첫번째 프로그램을 실행합니다.");
        };

        Runnable runnable2 = () -> {
            System.out.println("두번째 프로그램을 실행합니다.");
        };

        // Runnable 사용법
        runnable1.run();
        runnable2.run();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <100; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드1 : " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } //new Thread에는 기본적으로 runnable이 들어가있다.
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <100; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드2 : " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

//        thread1.start();
//        thread2.start();

        // Supplier 선언
        Supplier<String> supplier = () -> "공급"; //
        // Supplier 사용 (get.())
        System.out.println(supplier.get());

        // Consumer 선언
        Consumer<String> consumer = name -> { //매개변수가 하나라면 ()도 없앨수 있다.
            System.out.println("이름 : " + name);
        };
        // Consumer 사용 (accept.())
        consumer.accept("정순동");

        // Function
        Function<Integer, String> function = age -> "나이 : " + age;
        // Function 사용 (apply())
        System.out.println(function.apply(22));

        // Predicate 선언
        Predicate<Integer> leapMonth = year -> year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        // Predicate 사용 (test())
        System.out.println(leapMonth.test(2000));







    }

}

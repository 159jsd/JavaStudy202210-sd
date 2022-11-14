package j24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        list.forEach(name -> {
            System.out.println(name);
        });
        System.out.println("-----");

        Consumer<String> consumer = name -> System.out.println(name);

        for(String name : Objects.requireNonNull(list)) {
            consumer.accept(name);
        }

        Set<Integer> numbers = new HashSet<Integer>();
        for (int i=0; i<100; i++) {
            numbers.add(i+1);
        }

        AtomicInteger result = new AtomicInteger();

        numbers.forEach(num -> {
            result.addAndGet(num); // result.addAndGet(num); = result += result + num;
        });

        System.out.println(result.get());

        Map<Integer, String> students = new TreeMap<Integer, String>();

        for(int i = 0; i<10; i++) {
            students.put(20220001 + i,"김준" + (i+1));
        }

        students.forEach((Key,Value) -> {
            System.out.println("학번: " + Key + " 이름: " + Value);
        });


















    }

}

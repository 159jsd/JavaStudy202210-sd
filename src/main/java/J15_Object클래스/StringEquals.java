package J15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {
        int i = 10;


        String name1 = "김준일";
        String name2 = "김준일";
        String name3 = new String("김준일");
        String name4 = new String("김준일");
        System.out.println(name1 + ", " + name2 + ", " + name3);

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name4 == name3);
        //객체의 == 는 주소를 비교하는것이기 때문에 false가 나온다.
        System.out.println(name1.equals(name3));
        //.eqauls() 는 주소를 비교하지 않고 그 안의 값을 비교하기 때문에 true가 나온다.

    }
}

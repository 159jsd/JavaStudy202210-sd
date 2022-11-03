package J17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Product {
    public static int autoIncrement = 20220000;
    //static은 공유영역이다. 실행시 아무리 new를 많이 사용해도 static을 제외한 부분만
    //새로 만들어지며 static영역은 따로 나둬져서 다음 인스턴스 생성시 그 전값을 이용해
    //인스턴스에 전과 다른 값의 변수를 넣을수 있다.
    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }

    public static void printInfo() {
        System.out.println(autoIncrement);
        // System.out.println(productName);
        // -> productName이 static 값이 아니기 때문에 static 메소드안에
        // static값이 아닌 변수를 넣으면 불러올게 없게됨.
        Product product = new Product("product");
        System.out.println(product.productName);
        // 이렇게 Product클래스의 인스턴스를 만든 상태 에서는 호출이 가능하다.
    }
}



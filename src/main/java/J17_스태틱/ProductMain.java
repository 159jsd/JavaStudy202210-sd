package j17_스태틱;

import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {
    private String name;


    public static void main(String[] args) {

        int autoIncrement = Product.getAutoIncrement();
        //메모리를 사용하지 않아도 값이 불러와진다. (hit메모리가 아니다.)
        //static값은 메모리를 따로 사용한다.
        System.out.println(autoIncrement);
        System.out.println(Product.autoIncrement);
        Product.autoIncrement++;
        System.out.println(Product.getAutoIncrement());

        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        //static영역에 있는 값이기 때문에 어떤 인스턴스로 가져와도 그 전값
        //20220001 에서 new Product로 한번 생산 했는데 생산자에도 ++autoIncrement
        //가 되어 있기 때문에 static int autoIncrement 는 20220002가 되고
        // p1.getAutoIncrement() 는 20220002가 된다.

        System.out.println(PathRepository.PRODUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);

        Product.printInfo();

        ProductMain productMain = new ProductMain();

        productMain.setName("테스트");
        System.out.println(productMain.getName());

        Method1.main(new String[] {});
        Method1.call1();

    }
}

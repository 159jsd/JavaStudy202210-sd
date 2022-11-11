package j17_스태틱.싱글톤;

public class ProductView { // 이 로직은 객체를 딱 하나만 만들어서 사용하기 때문에 싱글톤이라고 한다.
    // 하나만 만들어서 다른 클래스에서 주소를 다 받아 쓸 수 있다.
    private static ProductView instance = null;

    private ProductView() {}

    public static ProductView getInstance() {
        if (instance == null) {
            instance = new ProductView();
        }
        return instance;
    }

    public void showMainView() {
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView() {
        System.out.println("주문 정보를 보여주는 화면");
    }









}

package j17_스태틱.싱글톤;

public class ViewMain {
    public static void main(String[] args) {
        ProductView productView = ProductView.getInstance();

        productView.showMainView();
        productView.showOrderView();
        System.out.println();

        ProductView.getInstance().showMainView();
        ProductView.getInstance().showOrderView();










    }
}

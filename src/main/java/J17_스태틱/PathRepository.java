package j17_스태틱;

public interface PathRepository {
    public static final String PRODUCT_IMG_PATH = "C:/upload/product/";
    public static final String PROFILE_IMG_PATH = "C:/upload/profile/";
    public static final String MAIN_IMG_PATH = "C:/upload/main/";
    // 이렇게하면 class를 따로 생성(인스턴스화)하지 않아도 어디서든지 가져올 수 있다.
    // 보통 인터페이스에 만든다.
}

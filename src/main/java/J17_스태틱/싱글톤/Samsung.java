package j17_스태틱.싱글톤;

import lombok.Getter;


public class Samsung {

    @Getter //이렇게 변수 바로위에 getter를 넣으면 그 변수의 getter만 생선된다.
    private String company;
    private int serialNumber;

    private static Samsung instance = null;

    private Samsung() {
        company = getClass().getSimpleName();
        serialNumber = 2022000;
    }

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + serialNumber++;
    }


















}

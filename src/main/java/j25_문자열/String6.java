package j25_문자열;

import java.util.Objects;

public class String6 {

    public static void main(String[] args) {

        String httpRequest = null;
        /*
            문자열이 비어있지 않으면 이라는 조건문의 조건
            1. null 이 아니어야 한다.
            2. "" 이 아니어야 한다.
            3. " " 이 아니어야 한다.
         */
        if (!httpRequest.isBlank()) {
            System.out.println(httpRequest);
        }else {
            System.out.println("공백은 사용할 수 없습니다.");
        }

    }

}

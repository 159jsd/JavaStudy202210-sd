package j25_문자열;

public class String5 {

    public static void main(String[] args) {

        String httpMethod = "Get";

        if(httpMethod.equalsIgnoreCase("get")) {
            System.out.println("Get요청입니다.");
        }else {
            System.out.println("Get요청이 아닙니다.");
        }

    }

}

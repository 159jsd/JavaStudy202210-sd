package j23_예외;

public class Exception1 {
    public static void main(String[] args) {

        int numbers[] = new int[] {1, 2, 3, 4, 5, 6, 7};

        try {
            System.out.println("파일 열기");
            String a = null;
            a.toLowerCase();

            for (int i = 0; i < 8; i++) {
                System.out.println(numbers[i]);
            }
            // 앞에서 예외가 처리 되었기에 작동하지 않는다.
            System.out.println("파일 닫기");
            // 필수적인 로직이 try안에 들어 있으면 해당 로직은 finally안에 또 적는다.
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException 예외처리실행");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException 예외처리실행");
            // 앞에서 예외가 처리 되었기에 작동하지 않는다.
        }
        finally { // 꼭 실행 되어야 하는 로직을 적는다. try{}안에 어떤 일이 일어났어도
            // finally는 실행 된다.
            System.out.println("파일 닫기");
            System.out.println("프로그램 저장");
        }

        System.out.println("프로그램 정상 종료");



    }
}

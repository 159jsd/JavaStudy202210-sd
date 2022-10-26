package j09_클래스;

public class ClassA {

    int num;
    String name;
    double score;

  /*   생성자 생략되어 있는거임.
     생성자는 클래스명과 무조건 같아야 하며 반환자료형이 없다.
     생성자는 항상 기본 반환값이 있다. (주소만 반환함)
     오버로딩이 되며 안에 로직도 담을수 있다.
     생성자 만들어지는게 우선이고 그 다음 주소를 출력한다.
     다른 생성자로 오버로딩 되면 기본 생성자는 비활성화 된다.
     생성자가 하나도 안되어 있으면 기본 생성자가 활성화 되어 있다.
     생성자의 매개변수는 argument라고 하며 기본 생성자는 noArgument Constructor라고 한다.
     Properties(속성) - (맴버)변수
     schoolName - string
     studentCode - integer
     studentYear - integer
     name - string
     Function(기능) - (맴버)메소드
     increaseStudentYear() - 호출시에 현재 학년을 1학년 증가 (최대 5학년)
     showStudentInfo() - 학생 정보 출력

     */
    ClassA(int a) {
        System.out.println("a : " + a);
        System.out.println("ClassA를 생성합니다.");
    }

    ClassA() {

    }
    void callName() {
        System.out.println(name + "을(를) 부릅니다.");
    }

}

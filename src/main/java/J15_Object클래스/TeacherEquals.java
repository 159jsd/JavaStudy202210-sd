package J15_Object클래스;

public class TeacherEquals {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("김준일","코리아아이티");
        J15_Object클래스.equals.Teacher teacher2
                = new J15_Object클래스.equals.Teacher("김준일","코리아아이티");

//        System.out.println(teacher1 == teacher2);
        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1.hashCode() == teacher2.hashCode());
        //hashcode() 는 name,과 schoolName의 값으로만 비교하게끔 만들었기 때문에
        //name, schoolName의 값이 같으면 true가 나온다.
        //자바 기초, 사실상 쓸 일은 String.equals 말곤 거의 없다고한다.























    }
}

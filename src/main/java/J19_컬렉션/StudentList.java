package J19_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "김준이"));
        students.add(new Student(20220003, "김준삼"));
        students.add(new Student(20220004, "김준사"));
        students.add(new Student(20220005, "김준오"));
        students.add(new Student(20220006, "김준육"));

        String searchName = "김준삼";
        //일반 For문을 사용한 학생이름으로 학번찾기
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getName().equals(searchName)) {
                System.out.println(searchName + " 학생의 학번 : " + student.getId());
                break;
            }
        }
        //For Each문을 사용한 학생이름으로 학번찾기.
        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                System.out.println(searchName + " 학생의 학번 : " + student.getId());
                break;
            }
        }

        int searchID = 20220002;
        //일반 For문을 사용한 학번으로 정보 삭제하기
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == (searchID)) {
                students.remove(i);
                break;
            }
        }
        System.out.println(students);
        //For Each문을 사용한 학번으로 정보 삭제하기.
        for (Student student : students) {
            if (student.getId() == searchID) {
                students.remove(students.indexOf(student));
                break;
            }
        }

        System.out.println(students);

    }
}

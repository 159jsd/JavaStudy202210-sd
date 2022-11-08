package J19_컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "김준이"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
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

        /*
        id = 20220003 학생을 찾아서 그 학생의 이름이 김규민이면 김경민으로 바꿔라.
        */

        searchID = 20220003;
        searchName = "김규민";
        for (Student student : students) {
            if (student.getId() == searchID && student.getName().equals(searchName)) {
                student.setName("김경민");
                break;
            }
        }

        System.out.println(students);
        System.out.println("-----------------------------");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        searchID = 20220004;

        /*
        박경호를 박창우로 변경
         */

        Iterator<Student> studentsi = students.iterator();

        while (studentsi.hasNext()) {
            Student student = studentsi.next();
            if (student.getId() == searchID) {
                student.setName("박창우");
                break;
            }
        }

        for (Student student : students) {
            System.out.println(student);
        }

        List<Student> reverseStudents = new ArrayList<Student>();

//        for(int i = 0; i < students.size(); i++) {
//            reverseStudents.add(students.get(students.size() - 1 - i));
//        }

        for (Student student : students) {
            reverseStudents.add(0,student);
        }

        System.out.println("--------------------------");

        for(Student a : reverseStudents) {
            System.out.println(a);
        }

        Collections.reverse(reverseStudents);
        System.out.println("--------------------------");
        for(Student a : reverseStudents) {
            System.out.println(a);
        }

        /*
            idList
            nameList

         */

        ArrayList<Integer> idList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();

        for(Student student : students) {
            idList.add(student.getId());
            nameList.add(student.getName());
        }

        for (Integer id : idList) {
            System.out.println(id);
        }

        for (String name : nameList) {
            System.out.println(name);
        }

        students.clear();

        for (int i = 0; i < idList.size(); i++) {
            Student student = new Student(idList.get(i),nameList.get(i));
            students.add(student);
        }

        for(Student student : students) {
            System.out.println(student);
        }
    }
}

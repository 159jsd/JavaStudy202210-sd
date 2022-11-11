package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();
        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일");

        // 값 추가
        strSet.add("김준일");
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");

        System.out.println(strSet);
        strSet.addAll(strList);
        System.out.println(strSet);
        // 값 조회
        String searchName = "김준일";

        /*
        strSet에 김준일이 있으면 true, 없으면 false
         */
        boolean isTrue = false;
        for (String name : strList) {
            if (name.equals(searchName)) {
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);
        System.out.println("------------");

        // 수정
        /*
            송아셀 -> 남강석
         */

        searchName = "송아셀";
        for (String name : strSet) {
            if (name.equals(searchName)) {
                strSet.remove(searchName);
                strSet.add("남강석");
                break;
            }
        }

        System.out.println(strSet);

        searchName = "김준일";

        System.out.println(strSet.contains(searchName));
        if(strSet.contains(searchName)) {
            strSet.remove(searchName);
            strSet.add("김준이");
        }

        System.out.println(strSet);


    }
}

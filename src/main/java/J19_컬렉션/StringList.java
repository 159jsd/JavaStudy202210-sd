package J19_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        printCollection(list);

        //값 추가
        list.add("문자열 1");
        list.add("문자열 2");
        list.add("문자열 3");
        list.add("문자열 4");

        printCollection(list);

        list.add(1,"문자열 5");
        printCollection(list);

        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list);
        addAllList.addAll(2,list);
        printCollection(addAllList);

        //값 조회
        String str1 = list.get(0);
        System.out.println("str1 : " + str1);


        //반복을 사용한 값 조회
        for(String str : list) {
            System.out.println("str : " + str);
        }
        //for each문 list안에 들어있는 모든 String들을 str에 한번씩 대입해서 로직을 돌린다.

        //일반 for문을 사용한 값 조회
        for (int i = 0; i < list.size(); i++) {
            System.out.println("str : " + list.get(i));
        }

        //iterator 반복자를 사용한 값 조회
        Iterator<String> iterator = list.iterator();
        // .iterator(); 은 어떤 list를 iterator로 변환한다.

        while(iterator.hasNext()) {
            System.out.println("iterator : " + iterator.next());
        }
        //이렇게 사용하고 나서 iterator는 값을 모두 사용해서 잃는다.
        //이 뒤에 강제로 iterator.next()를 하게 되면 다음값이 없기때문에 오류가 난다.
        //그래서 while(interator.hasNext())와 함께 사용하는게 좋다(예외처리 안하면)

        //값 수정
        list.set(1, "문자열 6");
        //(i번째인덱스에 있는 값을, "x"문자열로 바꿔라)
        printCollection(list);

        //값 삭제
        //remove를 사용할땐 object와 인덱스번호를 넣을 수 있다. 보통 인덱스를 사용한다.
        list.remove(0);
        printCollection(list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("문자열 3")) {
                list.remove(i);
                break; //하나 없애면 list의 크기가 줄어들고 앞으로 땡겨지기 때문에 오류가 발생할
                //가능성이 높아진다. 따라서 꼭 break와 함께 사용한다.
            }
        }

        list.add("문자열 2");
        printCollection(list);

        //값의 위치찾기
        int index = list.indexOf("문자열 2");
        System.out.println("문자열 2 의 위치 : "+index);

        int lastIndex = list.lastIndexOf("문자열 2");
        System.out.println("뒤에서부터 찾은 문자열 2의 위치 : "+lastIndex);

        //값을 포함하고 있는지 여부 조회
        boolean isTrue = list.contains("문자열 5");
        System.out.println("list에 문자열5가 포함되어 있는가? " + isTrue);
        System.out.println();

        //리스트를 배열로 변환
        Object objects[] = list.toArray();
        System.out.println("배열 objects[0] = " + objects[0]);
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public static void printCollection(Collection collection) {
        System.out.println(collection);
        System.out.println();

    }

}

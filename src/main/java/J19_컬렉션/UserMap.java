package J19_컬렉션;


import java.util.*;

public class UserMap {
    public static void main(String[] args) {

        Map<String, String> userMap = new HashMap<String, String>();

        userMap.put("username","junil");
        userMap.put("password","1234");
        userMap.put("email","skjil1218@gmail.com");
        userMap.put("name","김준일");



        List<String> keyNames = new ArrayList<String>();
        Set<String> userMapKeys = userMap.keySet();
        keyNames.addAll(userMapKeys);

        String keyName1 = keyNames.get(0);
        String keyName2 = keyNames.get(1);
        String keyName3 = keyNames.get(2);
        String keyName4 = keyNames.get(3);


        String value1 = userMap.get(keyName1);
        String value2 = userMap.get(keyName2);
        String value3 = userMap.get(keyName3);
        String value4 = userMap.get(keyName4);

        System.out.println(keyName1 + " >> " + value1);
        System.out.println(keyName2 + " >> " + value2);
        System.out.println(keyName3 + " >> " + value3);
        System.out.println(keyName4 + " >> " + value4);
    }
}

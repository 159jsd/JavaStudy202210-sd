package j25_문자열;

import java.util.UUID;

public class UUIDString {

    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();

        String replaceUUID = uuid.replaceAll("-","");

        int replaceUUIDLength = replaceUUID.length();
        int halfIndexOfReplaceUUID = replaceUUIDLength / 2;

        String leftUuid = replaceUUID.substring(0,halfIndexOfReplaceUUID);
        String rightUuid = replaceUUID.substring(halfIndexOfReplaceUUID);

        System.out.println(replaceUUID);
        System.out.println(leftUuid);
        System.out.println(rightUuid);


    }

}


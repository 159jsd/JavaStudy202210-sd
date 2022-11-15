package j25_문자열;

public class String1 {

    public static void main(String[] args) {

        String filePath1 = "C:/Users/junil/java-study/src/main/java/String.java";
        String filePath2 = "C:/Users/junil/project/java-study2/src/main/java/Integer.java";

        /*
        subString() - 문자열을 자른다.
        indexOf() - 내가 찾는 문자열의 위치 인덱스를 반환
         */

        // -------------- 내가 풀이한거 --------------- //
        String whichFile = filePath2;

        String subFilePath = whichFile.substring(0,whichFile.indexOf("/src"));

        String projectName = subFilePath.substring(subFilePath.lastIndexOf("/")+1);
        String fileName = whichFile.substring(whichFile.lastIndexOf("/")+1,whichFile.lastIndexOf("."));
        String extension = whichFile.substring(whichFile.lastIndexOf("."));

        System.out.println("프로잭트명: " + projectName);
        System.out.println("파일명: " + fileName);
        System.out.println("확장자명: " + extension);

        System.out.println();
        // ------------ 강사님이 풀이한거 ------------- //
        int srcIndex = filePath1.indexOf("/src");
        String projectPath = filePath1.substring(0,srcIndex);
        String projectName2 = projectPath.substring(projectPath.lastIndexOf("/")+1);
        String fileName2 = filePath1.substring(filePath1.lastIndexOf("/")+1,filePath1.lastIndexOf("."));
        String extension2 = filePath1.substring(filePath1.lastIndexOf("."));

        System.out.println("프로잭트명: " + projectName2);
        System.out.println("파일명: " + fileName2);
        System.out.println("확장자명: " + extension2);
    }

}

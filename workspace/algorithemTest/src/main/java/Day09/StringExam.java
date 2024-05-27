package Day09;

public class StringExam {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println("문자열 길이 : " + greeting.length()); // 문자열 길이
        System.out.println("문자열 길이 : " + greeting.charAt(4)); // 5번째 문자 출력
        System.out.println("문자열 길이 : " + greeting.substring(7,12)); // 부분문자 출력

        System.out.println("==========================");

        String str1 = "Java";
        String str2 = "JAVA";
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str2)); //대소문자 구분x


        System.out.println("==========================");


        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World"); //문자열 추가
        builder.insert(6, "Java "); // 특정 위치에 문자열 삽입
        System.out.println(builder);

        builder.delete(6,11); // 특정부분 삭제
        System.out.println(builder);

        builder.reverse(); //문자열 뒤집기
        System.out.println(builder);
    }
}

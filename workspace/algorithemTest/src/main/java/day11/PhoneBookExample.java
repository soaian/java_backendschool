package day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBookExample {
    public static void main(String[] args) {
        Map<String,String> phoneBook = new HashMap<>();

        phoneBook.put("김철수","010-1234-5678");
        phoneBook.put("박영희","010-8765-4321");
        phoneBook.put("이민지","010-5566-7788");

        String minjiNumber = phoneBook.get("미인지");
        System.out.println("이민지의 전화번호 : " + minjiNumber);

        System.out.println("전체 전화번호 목록 :");
        for (Map.Entry<String,String> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("두번째 방법으로 전화번호 목록 꺼내기 :");
        Set<String> setKey = phoneBook.keySet();
        for (String str : setKey){
            System.out.println("이름 : " +str + ", 전화번호 : " +  phoneBook.get(str));
        }

        //데이터 삭제
        phoneBook.remove("이민지");
        System.out.println("전체 전화번호 목록 :");
        for (Map.Entry<String,String> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //특정 키 존재 여부 확인
        if (phoneBook.containsKey("김철수")){
            System.out.println("존재해요");
        }

        //특정 값 존재엽3ㅜ확인
        if (phoneBook.containsValue("010-1234-5678")){
            System.out.println("있어요");
        }else {
            System.out.println("없어요");
        }


        //Map의 비었는지 확인
        System.out.println("비었어요?" + phoneBook.isEmpty());

        //Map의 크기 확인
        System.out.println(phoneBook.size());
    }
}

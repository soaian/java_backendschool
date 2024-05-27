package day10;

import Day09.Book;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("test");
        list.add(10); //오토박싱을 통해 Integer
        list.add(new Book("자바"));

        System.out.println(list);
        //제네릭이 없었을때는 매번 형변환이 필요...
       // String strvalue = list.get(0);
        String strvlaue = (String)list.get(0);
        Integer i = (Integer) list.get(1);
        System.out.println(i);
        int value = (Integer)list.get(1);

        System.out.println(list.toString());

        List<String> strList = new ArrayList<>(); //제네릭!! (String으로 제한)
        strList.add("abc");
        // String이 아니라서 안됨
//        strList.add(10);
//        strList.add(new Book());
        String sValue = strList.get(0); //꺼낼때 형변환 필요 없음
    }
}

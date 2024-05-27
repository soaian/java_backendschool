package day11;

import java.util.*;

public class IteratorExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("==============================");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("==============================");

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        //set은 순서가없어서 위와같이 꺼낼수없음
        //따라서 Iterator을 이용

        Iterator<String> iter2 = set.iterator();
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }

        System.out.println("==============================");

        for (String str : set){ //java 5 version에서 추가!
            System.out.println(str);
        }
    }
}

package day11;

import java.util.*;

public class SetExam {
    public static void main(String[] args) {
        //가장많이 사용하는 셋의 구현체
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println(set);
        set.add("a");

        System.out.println(set); //중복 안됨

        if (set.contains("a")){
            System.out.println("true");
        }

        set.remove("a");
        System.out.println(set);
        System.out.println(set.size());

        Set<Pen> penSet  = new HashSet<>();
        penSet.add(new Pen("red"));
        penSet.add(new Pen("black"));
        penSet.add(new Pen("blue"));

        System.out.println(penSet);
        penSet.add(new Pen("red"));

        System.out.println(penSet);



//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        System.out.println(list);
//
//        list.add("a");
//        System.out.println(list);

    }
}

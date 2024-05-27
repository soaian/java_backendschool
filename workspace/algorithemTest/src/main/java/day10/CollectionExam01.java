package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class CollectionExam01 {
    public static void main(String[] args) {
        //리스트는 배열과는 다르게 가변길이. 몇개의 사이즈를 정의하고 다쓰면 알아서 늘어남
        ArrayList<String> strList = new ArrayList<>();
        System.out.println(strList.size());

        strList.add("a");
        strList.add("b");
        strList.add("c");

        System.out.println(strList.size());

//        strList.add("a");
//        strList.add("b");
//        strList.add("c");
//        strList.add("a");
//        strList.add("b");
//        strList.add("c");
//        strList.add("a");
//        strList.add("b");
//        strList.add("c");
//        strList.add("a");
//        strList.add("b");
//        strList.add("c");
//        strList.add("a");
//        strList.add("b");
//        strList.add("c");

        System.out.println(strList.size());

        for (String str : strList){
            System.out.println(str);
        }
        System.out.println("========================");
        System.out.println(strList.get(0));

        System.out.println("========================");
        //인터페이스 타입으로 사용하지 않으면 나중에 Vector을 썻다가 ArrayList로 바꾸게 되면 나머지 코드를 다 수정해야하지만 인터페이스 타입으로 사용하면 뒤의 코드를 수정하지 않아도 됨
        // 즉, 유연하기 때문에 인터페이스 사용을 권장한다
//        Vector<String> vector = new ArrayList<>();
//        vector.addElement("a");
//        vector.addElement("b");

        List<String> list = new Vector<>();
        list.add("abc");
        list.add("def");
        list.add("hahaha");

        for (String str : list){
            System.out.println(str);
        }

        System.out.println(list); //요소를 꺼낸것은 아님 -> String이 아님
        System.out.println(list.get(0));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);
        System.out.println(integerList.remove(0));
        System.out.println(integerList);
        System.out.println(integerList.contains(2));
        System.out.println(integerList.remove(Integer.valueOf(2)));
        System.out.println(integerList);
        integerList.add(5);
        integerList.add(5);
        System.out.println(integerList); //list는 중복이 가능하다
        System.out.println(integerList.remove(Integer.valueOf(5))); //중복된 5중 앞에있는 5를 하나만 지움
        System.out.println(integerList);
        integerList.clear(); //객체는 그대로 두고 데이터만 비움
        System.out.println(integerList);
    }
}

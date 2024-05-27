package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(111,"kang");
        map.put(222,"kim");
        map.put(333,"hong");
        System.out.println(map);

        System.out.println(map.get(111));

        System.out.println("====================");

        Set<Integer> keyset = map.keySet();
        Iterator<Integer> iterator = keyset.iterator();
        while (iterator.hasNext()){
            Integer key =  iterator.next();
            System.out.println("key : " + key);
            System.out.println("value : " + map.get(key));
        }
        System.out.println("=====================");

        for (Integer key : keyset){
            System.out.println("key : " + key);
            System.out.println("value : " + map.get(key));
        }
        System.out.println("=====================");
        System.out.println(map.keySet());
    }
}

package day10;

import java.util.List;

public class GenericMethodExample3 {
    public static <T> void printFirst(List<? extends T> list){
        if (!list.isEmpty()){
            T item = list.get(0);
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        //Integer리스트
        List<Integer> integerList = List.of(1,2,3);
        printFirst(integerList);

        //String 리스트
        List<String> stringList = List.of("Hello","World");
        printFirst(stringList);
    }
}

package day11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExam02 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("오렌지");
        fruits.add("포도");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

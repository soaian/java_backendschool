package day11;

import java.util.*;

public class ListExam {
    public static void main(String[] args) {

        // 검색할때는 어레이리스트가 적합. 배열처럼 사용되기때문에 추가 삭제시 배열의 전체구조 변경이 필요해서 시간이 더 필요함
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        //요소 얻기
        String firstFruit = fruits.get(0);
        System.out.println("첫 번재 과일 : " + firstFruit);

        //요소 수정
        fruits.set(1,"blueberry");

        //요소 삭제
        fruits.remove("cherry");
        System.out.println(fruits);

        fruits.remove(0);
        System.out.println(fruits);
        //리스트 출력
        System.out.println("업데이트된 과일 리스트 : " + fruits);

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //접근에 시간이 필요하나, 배열의 추가 삭제가 빈번하게 일어나는 경우 링크드리스트가 더 사용에 적합 주소만 변경되면 되기 때문에
        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");

        linkedList.remove("a");

        System.out.println("===========================");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println(integerList);
        //섞기
        Collections.shuffle(integerList);
        System.out.println(integerList);

        //재정렬
        Collections.sort(integerList);
        System.out.println(integerList);
    }
}

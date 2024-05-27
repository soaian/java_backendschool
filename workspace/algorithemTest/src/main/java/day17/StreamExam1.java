package day17;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExam1 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("aase","bgd","ace","deer");
        List<String> filteredList = myList.stream()
                                    .filter(s -> s.startsWith("a"))
                                    .collect(Collectors.toList());
        System.out.println(filteredList);

        //스트림 쓰지 않고 결과값 나오게 하려면
        Predicate<String> check = s -> s.startsWith("a");
        List<String> filteredList2 = new ArrayList<>();
        for (String string : myList){
            if(check.test(string)){
                filteredList2.add(string);
            }
        }
        System.out.println(filteredList2);

        System.out.println("======================");

        String[] names = {"kang","kim","hong","lee","son"};
        for (String name : names){
            System.out.println(name);
        }
        System.out.println("===========스트림===========");
        Arrays.stream(names).forEach(System.out::println);
        System.out.println("============람다==========");
        Arrays.stream(names).forEach(name -> System.out.println(name));
        System.out.println("=============오리지널=========");
        Arrays.stream(names).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        int[] iarr = {1,2,3,4,5,6,7,8};
        //짝수만 출력
        for (int i:iarr){
            if (i %2 ==0){
                System.out.println(i);
            }
        }
        Arrays.stream(iarr).filter( a -> a % 2 == 0).forEach(System.out::println);

        System.out.println("=========스트림=============");
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Cherry", "Date");
        List<String> filteredList3 = words.stream().filter(s -> s.length()>=5).distinct().collect(Collectors.toList());
        System.out.println(filteredList3);

        System.out.println("=========스트림사용x=============");
        List<String> filteredList4 = new ArrayList<>();
        for (String a : words){
            if (a.length()>=5){
                if (!filteredList4.contains(a)){
                    filteredList4.add(a);
                }
            }
        }
        System.out.println(filteredList4);

        System.out.println("=========Map=============");
        words.stream().map(word->word.toUpperCase()).forEach(System.out::println);

        int[] intArr = {3,6,3,76,4,2};
        //각 요소에 3을 곱해서 출력해주세요
        Arrays.stream(intArr).map(i->i*3).forEach(System.out::println);


    }
}

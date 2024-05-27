package day17;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam4 {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Apple","Banana"),
                Arrays.asList("Cherry","Date")
        );

        List<String> flattenedList = nestedList.stream()
                                    .flatMap(Collection::stream)
                                    .collect(Collectors.toList());
        System.out.println(flattenedList);

        List<String> list = Arrays.asList("hello java", "hello carami", "lambda stream");
        list.stream().flatMap(s -> Arrays.stream(s.split(" "))).forEach(System.out::println);

        List<String> list2 = Arrays.asList("1,2,3,4,5,6,7,8");
        list2.stream()
                .flatMapToInt(data->{
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++){
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                         return Arrays.stream(intArr);
                })
                .forEach(System.out::println);

        System.out.println("=================================");

        list2.stream().flatMapToInt(data -> Arrays.stream(data.split(","))
                .mapToInt(str->Integer.parseInt(str.trim())))
                .forEach(System.out::println);
    }
}

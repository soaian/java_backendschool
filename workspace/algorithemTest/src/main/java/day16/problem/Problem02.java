package day16.problem;

import java.util.Arrays;
import java.util.Comparator;

//문제 2: 최대값 찾기
public class Problem02 {
    public static void main(String[] args) {
        Integer[] intArray = {1,5,3,4,2};
        Arrays.sort(intArray,(a,b)->a-b);
        System.out.println(intArray[intArray.length-1]);
    }
}

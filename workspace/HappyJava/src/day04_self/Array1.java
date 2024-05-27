package day04_self;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] array = {5,4,3,1,2};
        Arrays.sort(array); //작은것부터 정리
        for(int i : array){
            System.out.println(i);
        }
        System.out.println("==============");
        int[] array2= {12,9,10,5,8};
        Arrays.sort(array2);
        for (int i:array2){
            System.out.println(i);
        }
    }

}

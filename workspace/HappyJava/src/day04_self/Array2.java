package day04_self;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] array = {5,4,3,1,2};
        Arrays.sort(array);
        int i = Arrays.binarySearch(array, 1); //key에 해당하는 숫자가 몇번째에 있는지 찾는숫자
        System.out.println(i);
    }

}

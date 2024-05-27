package day04;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        int[] array1= {1,2,3,8,5};
        int[] array2= {3,2,3,5,5};
        int compare = Arrays.compare(array1,array2);
        System.out.println(compare); // 앞에것이 더 크면 +1 뒤에게 더 크면 -1
    }
}

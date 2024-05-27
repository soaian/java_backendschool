package chap02;
import java.util.Arrays;

import static chap02.BinarySearch.binarySearch;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] array1 = {1,5,3,10,2};
        Arrays.sort(array1);
        int resulIndex = binarySearch(array1,10);
        System.out.println(resulIndex+1);
    }
}

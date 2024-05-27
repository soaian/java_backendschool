package chap04;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i=0; i<array.length-1;i++){
            for(int j=0; j<array.length-i-1; j++){ //한번돌때 마지막 요소가 정렬됨
                if(array[j]>array[j+1]){
                    int temp =array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.println((i+1)+"번째 : "+Arrays.toString(array) );
        }
    }

//        for (int j = arr.length - 1; j > 0; j--) {
//            for (int i = 0; i < j; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int t = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = t;
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] array = {1,2,5,10,3};
        System.out.println("원래 배열은 "+ Arrays.toString(array));

        bubbleSort(array);

        System.out.println("정렬 후 배열은 "+ Arrays.toString(array));
    }
}

//public static void bubbleSort(int[] arr) {
//        int t;
//
//        for (int j = arr.length - 1; j > 0; j--) {
//            for (int i = 0; i < j; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    t = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = t;
//                }
//            }
//        }
//    }
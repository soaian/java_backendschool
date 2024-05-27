package Self;

import java.util.Scanner;

//역순
public class Self01 {
    //역순으로 정렬  reverse, sort없이
//    public static void main(String[] args) {
//        int[] arr = {10, 5, 7, 465, 5, 6, 2};
//        int tmp;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        for (int i : arr) {
//            System.out.println(i);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("사람 수를 입력하시오");
//        int student = sc.nextInt();
//        int[] scores = new int[student];
//        int[] array = new int[student];
//        for (int i = 0; i<scores.length;i++){
//            System.out.println("점수를 입력하시오");
//            scores[i]=sc.nextInt();
//        }
//        for (int i=0; i<scores.length; i++){
//            for (int j=i; j<scores.length; j++){
//                if (scores[i]<=scores[j]){
//
//                }
//            }
//        }
//        for (int j : scores){
//            System.out.println(j);
//        }
//    }

    public static void main(String[] args) {
        int a= 5;
        int b=6;
        a= b;
        System.out.println(a);
    }
}


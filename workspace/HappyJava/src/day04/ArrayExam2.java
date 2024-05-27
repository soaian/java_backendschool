package day04;

public class ArrayExam2 {
    public static void main(String[] args) {
        String[] word;
        word   = new String[3];

        word[1]="hello";

        System.out.println(word[1]);

        int[] array1, array2;
        int array3[], array4;

        array2 = new int[2];
        array4  = 10;

        int[] aaa = new int[4];
        aaa[0] = 19;

        //생성과 동시에 선언(초기화)까지 같이 진행
        int[] arr2 = new int[]{10,20,30};
        int[] arr3 = {10,20,30,40};

        //System.out.println(arr2[3]); // -> 오류 발생
        System.out.println(arr3[3]);
        System.out.println("--------------------");
        //반복문
        for (int i= 0; i<4;i++){
            aaa[i]=i+1;
        }
        for (int j = 0; j<4;j++){
            System.out.println(aaa[j]);
        }

    }
}

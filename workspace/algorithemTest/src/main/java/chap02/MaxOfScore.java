package chap02;

import java.util.Scanner;

public class MaxOfScore {
    static int maxOf(int[] scores){
        int max = scores[0];
        for (int i=1; i<=scores.length-1; i++)
            if (scores[i]>max)
                max = scores[i];
        return  max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수를 입력하시오");
        int student = sc.nextInt();
        int[] scores = new int[student];
        for (int i=0;i<student;i++){
            System.out.println(i+1+"번째 점수를 입력하시오");
            scores[i] = sc.nextInt();
        }
        System.out.println("가장 높은 점수는 "+maxOf(scores));
    }
}

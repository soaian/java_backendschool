package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfWeight {
    static int maxOf(int[] weights){
        int max = weights[0];
        for (int i=1; i<=weights.length-1; i++)
            if (weights[i]>max)
                max = weights[i];
            return  max;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("사람 수를 입력해주세요");
        int people = sc.nextInt();
        int[] weight = new int[people];
        for (int i=0; i<=people-1;i++){
            weight[i] = rd.nextInt(40)+60;
            System.out.println(weight[i]);
        }
        System.out.println("---------------");
        System.out.println("최댓값은" + maxOf(weight));
    }
}

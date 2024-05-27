package Self;

import java.util.Random;

public class RandomSelf {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] score = new int[3];
        for (int i=0; i<3; i++){
            score[i] = rd.nextInt(9)+1;
        }
        for (int i : score){
            System.out.println(i);
        }
    }
}

package day04;

public class Array3 {
    public static void main(String[] args) {
        int[][] score = new int[3][];
        score[0] = new int[20];
        score[1] = new int[3];
        score[2] = new int[5];

        for (int i =0; i< score.length; i++){
            for (int j =0; j<score[i].length;j++){
                System.out.println(score[i][j]);
            }
        }
    }
}

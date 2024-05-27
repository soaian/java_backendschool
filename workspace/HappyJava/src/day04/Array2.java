package day04;

public class Array2 {
    public static void main(String[] args) {
        int[][] array5 = new int[2][3];
        array5[0][0] = 0;
        array5[0][1] = 1;
        array5[0][2] = 2;

        for (int i=0; i< array5.length;i++) {
            for (int j = 0; j < array5[i].length; j++) {
                System.out.println(array5[i][j]);
            }
        }

    }
}

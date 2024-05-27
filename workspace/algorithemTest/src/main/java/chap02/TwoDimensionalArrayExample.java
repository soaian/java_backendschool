package chap02;

public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        int[][] scores = {{90, 80, 70, 60}, {80, 70, 60, 50}, {70, 60, 50, 40}};


        scores[0][0] = 90; // 첫 번째 학생의 첫 번째 과목 점수
        scores[0][1] = 80;
        scores[0][2] = 70;
        scores[0][3] = 60;

        scores[1][0] = 80; // 두 번째 학생의 첫 번째 과목 점수
        scores[1][1] = 70;
        scores[1][2] = 60;
        scores[1][3] = 50;

        scores[2][0] = 70; // 세 번째 학생의 첫 번째 과목 점수
        scores[2][1] = 60;
        scores[2][2] = 50;
        scores[2][3] = 40;

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int average = 0;
            System.out.println((i + 1) + "번째 학생의 점수");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(scores[i][j]);
                sum += scores[i][j];
                average = sum / scores[i].length;
            }
            System.out.println(sum);
            System.out.println(average);
        }
    }
}

//                int[][] scores = {
//                        {90, 80, 70, 60},
//                        {80, 70, 60, 50},
//                        {70, 60, 50, 40}
//                };
//
//                for (int i = 0; i < scores.length; i++) {
//                    int sum = 0;
//                    int avg = 0;
//                    System.out.println(i + 1 + "번째 학생의 과목 점수: ");
//                    for (int j = 0; j < scores[i].length; j++) {
//                        System.out.println(scores[i][j]);
//                        sum += scores[i][j];
//                        avg = sum / scores[i].length;
//                    }
//
//                    System.out.println("총점: " + sum);
//                    System.out.println("평균: " + avg);
//                }
//            }
//        }


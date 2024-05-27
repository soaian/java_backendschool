package Self;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
public class SelfBaseball {
    public static  void main(String[] args)  {
        // TODO: 프로그램 구현
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        List<Integer> user = new ArrayList<>();
        List<Integer> computer = new ArrayList<>();
        System.out.println("숫자 야구 게임을 시작합니다.");
        // 유저 점수 입력 받기
        userScores(input, user);
        computerScores(random,computer);
    }

    private static void computerScores(Random random, List<Integer> computer) {
    }

    private static void userScores(Scanner input, List<Integer> user) throws IllegalArgumentException {
        int score;
        System.out.println("숫자를 입력해주세요 : ");
        for (int i = 0; i<3; i++){
            score = input.nextInt();
            if (score<= 0 || score >=10){
                throw new IllegalArgumentException("0이하 혹은 10이상의 숫자를 입력하여 게임이 종료됩니다. 현재 입력한 숫자 : " + score);
            }else {
                user.add(score);
            }
        }
    }
}



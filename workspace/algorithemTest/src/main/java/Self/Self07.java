package Self;

import java.util.Scanner;

public class Self07 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1Correct = 0;
        int cards2Correct = 0;
        for (int i=0; i< goal.length;i++){
            if(i-cards2Correct<cards1.length && cards1[i-cards2Correct].equals(goal[i])){
                cards1Correct ++;
            } else if (i-cards1Correct<cards2.length && cards2[i-cards1Correct].equals(goal[i])) {
                cards2Correct ++;
            } else{
                answer = "No";
                return  answer;

            }
        }
        return answer;

    }

}

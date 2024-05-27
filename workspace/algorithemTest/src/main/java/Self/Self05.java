package Self;

import java.util.Scanner;

//첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
//땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
//달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
//달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
public class Self05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int day = A-B; // 날마다 증가하는 수
        int totalDay = 0;
        int finalDay = V-A; // 마지막날은 감소를 안하기 때문에 수식으로 도착할 수는 무조건 V-A의 값이 도착하고 그 후 1을 더하면 됨
        int check = 0;
        //V-A -> A-B
        for (int i= 1; i<V;i++){
            totalDay= totalDay + day;
            if (totalDay>=finalDay){
                check = i;
                break;
            }
        }
        System.out.println(check+1);
    }
}

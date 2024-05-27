package Self;

import java.util.Scanner;

//X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
//교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
public class Self04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] submit = new boolean[31];
        int count=0;
        for (int i=0; i<30; i++){
            submit[i] = false;
        }
        for (int i=1; i<=28; i++) {
                int num = sc.nextInt();
                if (submit[num]){
                    System.out.println("다시 번호를 확인해주세요");
                    break;
                } else{
                    submit[num] = true;
                    count++;}
            }if(count == 28 ) {
            for (int j = 1; j <= 30; j++) {
                if (!submit[j]) {
                    System.out.println(j);
                }
            }
            sc.close();
        }
        }
    }


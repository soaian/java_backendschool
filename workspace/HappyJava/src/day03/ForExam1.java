package day03;

public class ForExam1 {
    //for(1.변수의 초기화;2.탈출조건식;3.증감식){4.참인경우 실행}
    //실행순서는 1->2->4->3->2->4->3 이런식으로 조건이 참일때까지 반복
    //1~100까지 출력
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
        System.out.println("-----------");
     //짝수만 출력
     for (int i=1;i<=100;i++){
         if (i%2==0)
         System.out.println(i);
     }

     // 1-100까지의 짝수의 합을 출력
        System.out.println("-----------");
        int sum=0;
        for (int i=1;i<=100;i++) {
            if (i % 2 == 0){
                sum = sum + i;}
        }
        System.out.println(sum);
    }
}

package day03;
//1에서 100까지의 짝수의 합을 구해주세요
public class WhileExam2 {
    public static void main(String[] args) {
        int i = 1;
        int total=0;

        while(i<=100){
            if(i%2==0){
                total+=i;
            }
            i++;
        }
        System.out.println(total);
    }
        }





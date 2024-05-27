package day03;
//1에서 100까지의 짝수의 합을 구해주세요
public class WhileExam2_2 {
    public static void main(String[] args) {
    int num=1;
    int total=0;
    while(num<=100){
        if (num%2==0)
        {
            total+=num;
        }
        num++;
    }

        System.out.println(total);
    }
}

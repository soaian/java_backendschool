package day03;

public class WhileExam1 {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            if (i==5) break;
            System.out.println(i);
            i++;
        }
        System.out.println("---------------");
        i=1;
        while (true) { //무한히 출력
            if (i == 11) break;
            System.out.println(i);
            i++;
        }
        System.out.println("------------");
        i=1;
        while (i++<10){
            System.out.println(i);
        }
        //do while-> 일단 실행하고 while문에서 조건이 다르면 탈출


    }
}

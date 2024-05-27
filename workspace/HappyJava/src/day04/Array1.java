package day04;

public class Array1 {
    public static void main(String[] args) {
        int[][] aaa= new int[3][2];
        aaa [0][1] = 10;

        //이차원배열은 뒤에 숫자 생략 가능
        int[][] bbb = new int[3][];
        //bbb[1][2]=10; // 뒤에 가르키는 애가 없는데 선언했기 때문에 null 오류가 발생함
        bbb[0] = new int[3]; // 각각 넣어줘야함 0번에 쟁반 3개를 담는애가 나옴
        bbb[1] = new int[2]; // 각각 넣어줘야함 0번에 쟁반 2개를 담는애가 나옴
        bbb[0][0] = 10;

        //삼차원 배열도 동일함

    }
}

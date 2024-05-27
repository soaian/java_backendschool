package day04;

public class ArrayExam1 {
    public static void main(String[] args) {
        //배열의 선언, int형 배열에 주소를 담을 수 있는 그릇을 생성
        int[] iarr;

        int ierr2[];

        //배열의 생성 , 3개의 그릇을 생성 new 때문에 가르키는 형태가 나옴
        iarr = new int[3];
        ierr2 = new int[5];

        //이용 0부터 시작
        iarr[0] = 10;
        iarr[2] = 20;

        int i = iarr[0];

        System.out.println(i);
        System.out.println(iarr[0]);

        //오류 발생. 3개의 그릇만 설정했는데 4번째인 [3]에 숫자를 넣으려고 하니 오류 발생 ->out of bounds 오류 발생
        iarr[3]=5;
        System.out.println(iarr[3]);

    }
}

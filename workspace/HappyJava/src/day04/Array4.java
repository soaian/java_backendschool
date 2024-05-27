package day04;

public class Array4 {
    public static void main(String[] args) {
        // 모든구문을 꺼낼때  for each 문 사용
        int[] aaa= {10,20,30,40};
        for (int i:aaa){
            System.out.println(i);
        }
        // 위의 구문을 사용하지 않으면
        for (int i =0; i<aaa.length;i++){
            System.out.println(i);
        }
    }
}

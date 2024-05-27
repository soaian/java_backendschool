package day04;
// 아래 배열에서 최대값과 최소값을 찾아서 출력하세요
public class Array6 {
    public static void main(String[] args) {

        double[] doubles = {1.5, 3.7, 9.5, 3.1};

        double max = doubles[0];
        double min = doubles[0];
        System.out.println(max);
        System.out.println(min);
        System.out.println("----------------");
        for (double num:doubles){
            System.out.println(num);
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println(max);
        System.out.println(min);

    }
}

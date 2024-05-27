package day02;

public class BooleanTest2 {
    public static void main(String[] args){
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        flag1 = 10 > 5 && 5 < 20;
        flag2 = 10 > 5 & 5 < 20;
        flag3 = 10 >= 10 || 5 > 6;
        flag4 = 10 >= 10 | 5 > 6;
        flag5 = 10 == 10 ^ 5 == 4;
        flag6 = !flag5;
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);
        System.out.println(flag6);

        // &&와 &의 차이
        int a = 10;
        System.out.println(a>10 && a++ <20);
        System.out.println(a);

        int b = 10;
        System.out.println(b>10 & b++ <20);
        System.out.println(b);
        System.out.println("---------");
        //||와 |의 차이
        a= 10;
        System.out.println(a<=10 || a++<20);
        System.out.println(a);
        b= 10;
        System.out.println(b<=10 | b++<20);
        System.out.println(b);

        // /-> 나눈 몫만 줌, % -> 나눈 나머지 값
    }

}

package Self;

import java.util.Scanner;

//기본요금 410원, 운행시간이 600s가 넘어가면 1초당 2원 추가. 운행거래가 8km가 넘어가면 1km당 210원 추가
public class Self08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("운행시간을 입력하시오");
        int t = sc.nextInt();
        System.out.println("운행거리를 입력하시오");
        int d = sc.nextInt();
        int tPrice =0;
        int dPrice =0;
        if (t>600){
            tPrice = (t-600)*2;
        }else {
            tPrice = 0;
        }
        if (d>8){
            dPrice = (d-8)*210;
        }else {
            dPrice = 0;
        }
        int price = 410 + tPrice + dPrice;
        System.out.println(price);
    }

}

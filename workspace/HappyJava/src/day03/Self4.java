package day03;

import java.util.Scanner;

public class Self4 {
    public static void main(String[] args) {
        System.out.println("문자를 입력해주세요");
        System.out.println("정수를 입력해주세요");
        Scanner word = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int i =0;
        while (i++<=n){
            System.out.print(word);
        }

    }
}

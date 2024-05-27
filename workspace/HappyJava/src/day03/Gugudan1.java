package day03;

import java.util.Scanner;

public class Gugudan1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("단을 입력하세요.");
        int dan = keyboard.nextInt();

        for (int a = 1; a<=9; a++){
            System.out.println(dan + " * " + a +" = "+(dan*a));
        }

    }
}

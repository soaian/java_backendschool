package day03;

import java.util.Scanner;

public class Toy2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("문자를 입력해주세요");
    String word = scanner.nextLine();

    System.out.println("정수를 입력해주세요");
    int n = scanner.nextInt();

    int i = 0;
    while (i < n) {
        System.out.println(word);
        i++;
    }

    scanner.close();
}
}

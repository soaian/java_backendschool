package day03;

import java.util.Scanner;

public class NumberHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(charArray[i]);
            }
        }
    }
}


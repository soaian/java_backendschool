package Self;

import java.util.Scanner;

public class Self06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int totalDay = 0;
        int check = 0;
        for (int i = 1; i < V; i++) {
            totalDay = totalDay + (A - B);
            if (totalDay >= (V - A)) {
                check = i;
                break;
            }
        }
        System.out.println(check + 1);
    }
}
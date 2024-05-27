package Self;

import java.util.Scanner;

public class Self07_check {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a, b, v;
        double result;
        a=sc.nextInt();
        b=sc.nextInt();
        v=sc.nextInt();
        result = Math.ceil((v-b)/(a-b));
        System.out.println((int)result);
    }
}

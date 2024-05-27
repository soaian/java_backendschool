package Self;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class WhileExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        List<Integer> number = new ArrayList<>();
        while (!validInput) {
            System.out.println("숫자를 입력해주세요: ");
            String input = sc.nextLine();

            if (input.length() != 3) {
                System.out.println("숫자는 3자리를 입력해야 합니다.");
                throw new IllegalArgumentException("숫자는 3자리를 입력해야 합니다.");
            }

            for (int i = 0; i < input.length(); i++) {
                char digit = input.charAt(i);
                if (!Character.isDigit(digit)) {
                    System.out.println("숫자가 아닌 문자가 포함되어 있습니다.");
                    throw new IllegalArgumentException("숫자가 아닌 문자가 포함되어 있습니다.");
                }
                int num = Character.getNumericValue(digit);
                number.add(num);
            }

            validInput = true;
        }
    }
}
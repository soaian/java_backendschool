package Self.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private final List<Integer> number;

    public Player() {
        number = new ArrayList<>();
    }

    public List<Integer> getNumber() {
        return number;
    }

    public void guessNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
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

            break;
        }
    }
}

package Day09;

public class StringExam2 {
    //물품번호를 받아들여서 물품번호규칙에 맞으면 true,
    // 아니면 false를 리턴하는 메소드를 완성하세요.
    // 조건1. 물품번호의 길이는 6이다.
    // 조건2. 물품번호의 1,2 번째 자리는 알파벳이어야 한다. (대소문자 모두 가능)
    // 조건3. 물품번호의 3-6 자리수는 숫자만 가능하다.
    public static boolean checkProductNumber(String num) {

        // 조건1. 물품번호의 길이는 6이다.
        if (num.length() != 6) {
            return false;
        }

        // 조건2. 물품번호의 1,2 번째 자리는 알파벳이어야 한다. (대소문자 모두 가능)
        char char1 = Character.toUpperCase(num.charAt(0));
        char char2 = Character.toUpperCase(num.charAt(1));
        if (((int)char1 > 90 || (int)char1 < 65) || ((int)char2 > 90 || (int)char2 < 65) ) {
            return false;
        }

        // 조건3. 물품번호의 3-6 자리수는 숫자만 가능하다.
        for (int i = 2; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringExam2 se = new StringExam2();
        System.out.println(se.checkProductNumber("te3456")); // true
        System.out.println(se.checkProductNumber("t33456")); //false
        System.out.println(se.checkProductNumber("ar49786"));//false
        System.out.println(se.checkProductNumber("test56"));//false
    }

}

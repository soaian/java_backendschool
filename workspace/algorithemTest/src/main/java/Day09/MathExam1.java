package Day09;

public class MathExam1 {
    public static void main(String[] args) {
        int maxNumber = Math.max(10,20); //최대
        int minNumber = Math.min(10,20); //최소
        double squareRoot = Math.sqrt(16); //제곱근
        double power = Math.pow(2,3); //제곱

        System.out.println("최댓값 : "+ maxNumber);
        System.out.println("최소값 : "+ minNumber);
        System.out.println("제곱근 : "+ squareRoot);
        System.out.println("2의 3제곱 : "+ power);

        double randomValue = Math.random(); // 0.0~1.0사이의 난수
        System.out.println("랜덤값 : " + randomValue);
    }
}

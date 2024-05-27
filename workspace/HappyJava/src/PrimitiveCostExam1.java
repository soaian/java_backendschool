public class PrimitiveCostExam1 {
    public static void main(String[] args) {
        byte b = 10;
        int i = b; //묵시적 형변환 byte < int 괜찮음

        b=(byte)i; //명시적 형변환, 표기할 수 있는값인지 파악 못하고 그저 크기비교만 가능. 그래서 큰값에서 작은값으로 변환할때는 명시적 형변환이 필요
    float f = 10f;
    long l = (long)f; // float보다 long이 더 큼 그러나 묵시적 형변환을 하려하면 오류가 발생, float->소수점 이하값 표현 가능 long->정수(소수점표현x)만 표현, 그래서 묵시적으로는 형변환이 안됨

        float a= 10.5f;
        long l2 = (long)a;
        System.out.println(a);
        System.out.println(l2);
    }
}

package day05;

public class CalTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        // 플러스 테스트
        int result = cal.plus(10,20);

        System.out.println(result);

        System.out.println(cal.plus(3,5));

        // 마이너스 테스트

        System.out.println(cal.minus(10,5));
        result = cal.minus(20,10);
        System.out.println(result);

        // 핵심 구조 : 실제 보여지는 레이어-> 프레젠테이션 레이어 (보통 프론트)/ 업무에 대한것 (핵심코드) ->비즈니스 레이어,서비스레이어 (보통 백) / 데이터 저장소 (비즈니스레이어가 데이터를 끌어다 씀) -> 데이터 레이어,다오레이어 (보통 백)
        // 각각 테스트 필요 -> 제대로 동작하는지 알려줘야함
    }
}

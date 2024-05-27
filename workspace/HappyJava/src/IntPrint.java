public class IntPrint {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);
        System.out.println(100);

        byte a;
        short s;
        int e = 0;
        long l;
        float f;
        double d;
        char c;
        boolean b;
        // 기본데이터 타입/ 랙터 클래스 / 선언 시 바로 값이 들어와서 빠름 위 제외한 모든 것은 레퍼런스 타입
        // String -> hello를 선언할 시 바로 입력되지 않고 hello를 가르킴
        // book -> book title , book price -> title -> String-> String의 방향이 또 한번 전달되어야함(주소값만 전달됨)
        String str = "hello";
        //str 그 자체로 메소드를 가질수 있지만, 위의 기본데이터 중 i를 예로 들어 그 자체로 메소드를 가질 수 없다.
        Integer iii = 10;
        // 정수데이터 타입은 크기 순
        //&& -> 둘다 참이여야 true, 앞의 조건이 거짓일때, 뒤에 수식을 넘어가지 않음 & -> 앞의조건이 거짓이여도 뒤에조건에 넘어감
        //|| -> 둘중 하나가 참이여도 true, 앞의 조건이 참일때, 뒤에 수식을 넘어가지 않음
    }
}

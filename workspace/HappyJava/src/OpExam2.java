public class OpExam2 {
    public static void main(String[] args) {
        int a = 3;
        a +=3;
        System.out.println(a);
        System.out.println("----------");

        // a++와 ++a의 차이
        a= 3;
        System.out.println(a++); //먼저 a를 실행하고 증가시킴
        System.out.println(a);

        a=3;
        System.out.println(++a); // 먼저 증가를 시키고 그 후 증가된 a값에 대해 실행
        System.out.println(a);

        System.out.println("----------");
        //a+3과 a=a+3의 차이
        System.out.println(a+3);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        // static 입력할 시 다른 필드에서 쓸 수 있음, final -> 이값은 변경되지 않는다. 즉 변수가 아닌 상수로 값을 고정시킴
        // final로 상수표현을 하게되면 뒤에 값은 모두 대문자로 표기

    }
}

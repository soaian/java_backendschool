import day02.Book;

public class OpOfExam {
    public static void main(String[] args) {
        //삼항연산자
        // 조건 ? 반환값1 : 반환값2

        int a = 10;
        int b = 20;
        int result = a > 10 ? a : b; // a>10보다 크면, a를 보여주고 아니면 b를 보여줌
        System.out.println(result);

        System.out.println(result);
        Book book = new Book();
        if (book instanceof Book){
            System.out.println("Book은 객체입니다.");
        }
    }
}

package day03;

public class SwitchExam2 {
    public static void main(String[] args) {
       //if 구문으로 표현 시
        char ch = 'a';
        if (ch=='a'|| ch=='A') {
            System.out.println("A입니다.");
        }    else if (ch=='b'|| ch=='B'){
            System.out.println("B입니다.");
        }
            else if (ch=='c'|| ch=='C') {
            System.out.println("C입니다.");
        }
            else {
            System.out.println("A,B,C가 아닙니다.");
        }
            // 똑같은 것을 switch로 표현
         switch (ch){
             case 'a':
             case 'A':
                 System.out.println("A입니다.");
                 break;
             case 'b':
             case 'B':
                 System.out.println("B입니다.");
                 break;
             case 'c':
             case 'C':
                 System.out.println("C입니다.");
                 break;
             default:
                 System.out.println("A,B,C가 아닙니다.");

         }

    }
}

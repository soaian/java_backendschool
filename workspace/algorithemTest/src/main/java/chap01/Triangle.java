package chap01;

public class Triangle {
    public static void main(String[] args) {
        for (int i=0; i<=5;i++){
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }

            int j=0;
            System.out.println();
        }

        System.out.println("역삼각형그리기");

        for (int i=0;i<=5;i++){
            for (int j=5; j>=i;j--){
                System.out.print("*");
            }
            int j=0;
            System.out.println();
        }

        System.out.println("이등변삼각형 그리기");

    }
}

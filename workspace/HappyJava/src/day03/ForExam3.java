package day03;
//구구단 만들기
public class ForExam3 {
    public static void main(String[] args) {

        for (int a= 1;a<10;a++){
            for (int b= 1;b<10;b++){
                System.out.print(a+" * "+ b+" = "+(a*b)+"\t");

                // \t tab \n \r
                // printf로 하면 더 간단해짐 System.out.printf("%d * %d = %d\t",a,b,a*b);
            }
            if (a==5)
                break;

            System.out.println();
        }


    }

}

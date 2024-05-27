package day03;

public class LavelExam1 {
    public static void main(String[] args){
        outter:
        for(int i = 0; i< 3; i++){
            for(int k = 0; k < 3; k++){
                if( i == 0 && k == 2)
                    break;
                System.out.println(i + ", " + k);
            }
        }
        System.out.println("------------------");
        out:
        for(int i = 0; i< 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (i == 0 && k == 2)
                    continue;
                System.out.println(i + ", " + k);
            }
        }
    }

}

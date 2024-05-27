package Self;

import java.util.Random;

//윷놀이
public class Self03 {
    public static void main(String[] args) {
        Random rd = new Random();
        int sum = 0;
        for (int i=0; i<3;i++){
            for (int j=0; j<4;j++){
                int dot = rd.nextInt(2);
                System.out.print(dot+"\t");
                sum += dot;
            }
            System.out.println();
           switch (sum){
               case 0:
                   System.out.println("D");
                   break;
               case 1:
                   System.out.println("A");
                   break;
               case 2:
                   System.out.println("B");
                   break;
               case 3:
                   System.out.println("C");
                   break;
               case 4:
                   System.out.print("E");
                   break;
           }
            sum = 0;
            System.out.println();
        }

    }
}

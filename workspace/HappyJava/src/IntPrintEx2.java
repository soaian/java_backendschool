public class IntPrintEx2 {
    public static void main(String[] args) {
        int x= 1;
        int y= 1;
        while (x<=5){
                while (y<=x){
                    System.out.print("*");
                y= y + 1;
                }
            System.out.println();
                y=1;
                x= x + 1;

        }
        System.out.println("-------------");
        x=1;
        y=1;
        while (x<6){
            while (y<6){
                System.out.print("*");
                y= y+1;

            }
            System.out.println();
            x=x+1;
            y=x;
        }
    }
}

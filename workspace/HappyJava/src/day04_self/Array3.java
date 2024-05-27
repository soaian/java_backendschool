package day04_self;

public class Array3 {
    public static void main(String[] args) {
        for (String i:args){
            System.out.println(i);
        }
        System.out.println("==========");
        if (args.length ==0){
            System.out.println("사용법 : Array3 값 값 ...");
            System.exit(0); // return; 으로 변경 가능
        }
        for (String arg:args){
            System.out.println(arg);
        }
    }
}

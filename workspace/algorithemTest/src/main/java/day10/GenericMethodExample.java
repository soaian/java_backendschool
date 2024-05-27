package day10;

public class GenericMethodExample {
    public static <T> void  printArrayElements(T[] array){
        for (T elemnet : array){
            System.out.println(elemnet);
        }
    }


    public static void main(String[] args) {
        Integer[] iarry = {1,2,3,4,5,6};
        printArrayElements(iarry);

        String[] strArrya = {"hello","world","hahaha"};
        printArrayElements(strArrya);
    }
}

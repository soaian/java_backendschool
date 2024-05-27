package day04;

public class Array5 {
    public static void main(String[] args) {
        ItemForArray[] array= new ItemForArray[3];
        array[0] = new ItemForArray(500,"메론");
        array[1] = new ItemForArray(1000, "리치");
        array[2] = new ItemForArray(800,"참외");


        for (ItemForArray i:array){
            System.out.println(i.getName());
            System.out.println(i.getPrice());
        }
    }
}

package day04;

public class ArrayExam4 {
    public static void main(String[] args) {
        ItemForArray[] array1 =new ItemForArray[3];

        array1[0] = new ItemForArray(500,"사과");
        array1[1] = new ItemForArray(800,"수박");
        array1[2] = new ItemForArray(200,"복숭아");

        ItemForArray[] array2 = new ItemForArray[]{new ItemForArray(500,"사과"),new ItemForArray(100,"배"),new ItemForArray(200,"딸기")};

        System.out.println(array1[0].getName());
        System.out.println(array1[0].getPrice());
    }
}

package chap02;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] original = {10,20,30,40,50};
        int[] copied = original.clone();
        for (int i:copied){
            System.out.println(i);
        }
        copied[2] = 0;
        System.out.println("====================");
        System.out.println(original[2]);
        System.out.println(copied[2]);
        //값을 복사한거지 주소를 복사한것은 아님
    }
}

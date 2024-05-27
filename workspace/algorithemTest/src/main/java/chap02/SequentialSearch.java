package chap02;

public class SequentialSearch {
    static int sequentialSearch(int[] array, int key){
        for(int i =0; i<array.length;i++){
            if (array[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {5,10,15};
        int index = sequentialSearch(array1,10);

        if(index !=-1){
            System.out.println("당신이 찾는 숫자는 "+(index+1)+"번째에 있습니다");
        }
        else
            System.out.println("당신이 찾는 숫자는 없습니다.");
    }
}

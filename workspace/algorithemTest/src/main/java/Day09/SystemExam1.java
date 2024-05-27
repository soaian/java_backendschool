package Day09;

public class SystemExam1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        long startTime = System.currentTimeMillis();
        // 시간이 걸리는 작업 수행 후
        long endTime = System.currentTimeMillis();
        System.out.println("수행시간 : " + (endTime-startTime)+"ms");

        String pathVariable = System.getenv("PATH"); //환경변수조회
        System.out.println("Path Variable : " + pathVariable);



        int[] sourceArray ={1,2,3,4,5};
        int[] destArray = new int[5];

        System.arraycopy(sourceArray, 0, destArray, 0, sourceArray.length);
        for (int i:destArray){
            System.out.print(i + " ");
        }
    }
}

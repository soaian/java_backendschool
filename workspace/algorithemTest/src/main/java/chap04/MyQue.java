package chap04;

public class MyQue {
    private int maxQue; // 큐의 최대 크기 지정
    private int[] queArrays; // 큐 저장공간
    private int end; // 큐의 마지막
    private int first; // 큐의 첫번째

    public MyQue(int maxQue){
        this.maxQue = maxQue;
        this.queArrays = new int[maxQue];
        this.end = 0;
        this.first =0;
        int count = 0;

    }
    //비어있는지 확인
    public boolean isEmpty(){
        return (maxQue == end-1);
    }
    public void Enqueue(int data){
        queArrays[++end] = data;
    }

}

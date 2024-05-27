package day10;

import Day09.Book;

public class GenericPair <T1,T2> { //클래스를 정의할때부터 타입을 결정한것인데 인스턴스화 할때 타입이 결정됨
    private T1 first; //private int first 와 비슷하게 T1을 타입으로 생각하면 됨
    private T2 second;

    public GenericPair(T1 first,T2 second){
        this.first = first;
        this.second = second;
    }

    public T1 getFirst(){
        return first;
    }
    public void setFirst(T1 first){
        this.first = first;
    }

    public T2 getSecond(){
        return second;
    }

    public void setSecond(T2 second){
        this.second = second;
    }

    public static void main(String[] args) {
        GenericPair<String,Integer> pair = new GenericPair<>("Hello", 4);
        String first = pair.getFirst();
        int second = pair.getSecond();

        GenericPair<Book,String> pair2 = new GenericPair<>(new Book("모두의 자바"), "안녕");
        Book book = pair2.getFirst();
        String secondStr = pair2.getSecond();
    }
}

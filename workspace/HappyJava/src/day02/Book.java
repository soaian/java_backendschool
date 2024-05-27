package day02;

public class Book {
    private String title;

    private int price;

    //메소드
    //접근제한자 리턴타입 메소드명( 매개변수등...)( 구현)
    public String getTitle(/*여기에 들어갈 값은 구성요소는 아님*/){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

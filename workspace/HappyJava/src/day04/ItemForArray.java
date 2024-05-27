package day04;

public class ItemForArray {
    private int price; //ItemForArray 속성, 필드 , 나만쓰겠다
    private String name; //ItemForArray 속성, 필드 , 나만쓰겠다

    // 생성자 보통 기본생성자가 있지만 생성자를 아래와 같이 정의하면 기본생성자는 없앰
    public ItemForArray(int price, String name){
        // this를 안붙이면 가까이 있는 바로 위 구분의 프라이스를 이용
        this.price = price;
        this.name  = name;
    }  // 이제 이름과 가격을 바꿀 수 없음
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }


}



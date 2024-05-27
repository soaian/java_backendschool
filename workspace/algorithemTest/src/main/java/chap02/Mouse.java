package chap02;

public class Mouse {
    String color;
    int button;
    String maker;

    void sound(){
        System.out.println("Click");
    }
    void displayInfo(){
        System.out.println("color: "+color+" button: "+ button + " maker: "+maker);
    }
    Mouse(String color, int button, String maker){
        this.color = color;
        this.button = button;
        this.maker = maker;
    }

    static void classMethod(){
        System.out.println("클래스 메소드는 인스턴스화 하지 않아도 사용가능");
    }
    void instantMethod(){
        System.out.println("인스턴스 메소드는 인스턴스화 해야 사용가능");
    }

    public static void main(String[] args) {
        Mouse.classMethod(); // 바로 사용가능
        Mouse mouse = new Mouse("주황",3,"몰라");
        mouse.instantMethod(); //이래야 사용가능
    }
}

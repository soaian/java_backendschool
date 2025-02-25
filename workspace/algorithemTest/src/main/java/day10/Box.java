package day10;

public class Box<T> {
    private T content;
    public Box(T content){
        this.content = content;
    }

    public void setContent(T content){
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    @Override
    public String toString(){
        return "Box containing : " + content;
    }

    public static void main(String[] args) {
        Box<String> box = new Box("자바");
        System.out.println(box);
    }
}

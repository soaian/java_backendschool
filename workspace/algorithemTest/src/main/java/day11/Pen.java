package day11;

import java.util.Objects;

public class Pen {
    String color;

    public Pen(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return color + "pen";
    }
    //같다라고 판단하는 기준을 만들어야함

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}

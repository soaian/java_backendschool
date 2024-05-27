package day16;

public interface MyFunctionalInterface3 {
    public int method(int x, int y);

    default public void m(){} //얘는 구현체를 갖고있어 구분이 가능해서 람다식을 사용하더라도 가능함
}

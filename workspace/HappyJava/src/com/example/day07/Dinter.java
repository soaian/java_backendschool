package com.example.day07;

public interface Dinter extends Binter, Cinter{ //다중상속이 가능한 이유는 인터페이스에서는 구현이 없으니 구현할
    public void dMethod();

    @Override
    default void aMethod() {

    }

    @Override
    default void cMethod() {

    }

    @Override
    default void same() {

    }
}

//매개변수가 달라야 오버로딩이 됨

package com.example.day07;

public class InterfaceDemo {
    public static void main(String[] args) {


        //인터페이스도 타입이다.
        Ainter ainter = new DImpl();
        Cinter cinter = new DImpl();


        //자기가 정의한것만 사용 가능.
        ainter.aMethod();
        cinter.cMethod();

    }
}

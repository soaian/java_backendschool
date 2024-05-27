package com.example.day07;

public class Child extends Parent{
    public Child(){
        super("no name",0);
    }

    @Override
    public String getName() {
        System.out.println("나는 child에서 구현됨");
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

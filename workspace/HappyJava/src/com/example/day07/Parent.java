package com.example.day07;

public class Parent {
    private String name;
    private int age;

    public Parent(String name, int age){
        this.name=name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return "나는 부모";
    }

}

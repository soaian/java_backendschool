package com.example.day07;

public interface Calculator {
    public int plus(int i, int j);
    public int multiple(int i, int j);
    default int exec(int i, int j){
        return  i+j;
    }

    static void  light(){
        System.out.println("불을 밝히다.");
    }
}

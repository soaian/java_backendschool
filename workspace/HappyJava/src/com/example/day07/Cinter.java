package com.example.day07;

public interface Cinter {
    public void cMethod();
    public void same();
    default public void apple(){
        System.out.println("동일할 수 있나요");
    }
}

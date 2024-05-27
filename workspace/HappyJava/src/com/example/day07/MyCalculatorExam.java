package com.example.day07;

public class MyCalculatorExam {
    public static void main(String[] args) {
        Calculator cal = new MyCalculator();
        int multi = cal.multiple(3,4); // 타입은 자식을 따라감
        int value = cal.exec(5,10);
        System.out.println(value);
        System.out.println(multi);
    }
}

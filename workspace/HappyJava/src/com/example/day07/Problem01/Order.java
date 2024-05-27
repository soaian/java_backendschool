package com.example.day07.Problem01;

 public abstract class Order {
    public abstract void prepareFood();
    public abstract void serveFood();
    final void completeOrder(){
        System.out.println("주문이 완료되었습니다.");
    }
}

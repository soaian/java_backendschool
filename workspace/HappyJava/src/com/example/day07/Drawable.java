package com.example.day07;

public interface Drawable {
    default public void draw(){
        // 원래 인터페이스는 껍데기만 제공해야하지만, 인터페이스에 기능 하나를 추가하면 이를 상속하는 모든 클래스에 문제가 발생하여 이를 막기위해 임시로 default 설정 후 임시구현 해야함
        //즉, 필요한것만 오버라이드 해서 쓰게할 목적
        //그러나 강제성이 없기 때문에 꼭 필요한 요소라면 default를 사용하지 않는것이 좋다
        System.out.println("도형을 그립니다.");
    }
}

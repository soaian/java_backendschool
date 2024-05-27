package com.example.day07;

abstract public class 새 {
    abstract public void 노래하다();
    //구현은 필요하지만 구체적으로 지정해줄 필요는 없음->어짜피 각자마다 다르게 오버라이딩하기때문에 ->그러므로 필요한게 추상클래스
    //추상메서드는 반드시 상속받는 자식들이 구현해야하는 필수 요소임
}

class 비둘기 extends 새{
    @Override
    public void 노래하다() {
        System.out.println("구구");
    }
}

class 참새 extends 새{
    @Override
    public void 노래하다() {
        System.out.println("짹짹");
    }

}

class  까마귀 extends 새{
    @Override
    public void 노래하다() {
        System.out.println("깍깍~");
    }

}

abstract class 앵무새 extends 새{ //새를 상속받았지만 앵무새도 추상클래스이기 때문에 새의 추상메서드를 구현할 필요 없다
    abstract public void  말하다();
}

class 왕관앵무 extends 앵무새{ //그러나 얘는 둘의 추상클래스를 둘다 받아야한다.

    @Override
    public void 노래하다() {

    }

    @Override
    public void 말하다() {

    }
}
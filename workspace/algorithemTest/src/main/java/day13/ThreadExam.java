package day13;

class MyThread extends Thread{ //상속.. thread를 상속받은 Mythread는 thread이다.

    @Override
    public void run() {
        System.out.println("myThread 출발");
        //실제 쓰레드가 해야하는 일
        for (int i =0 ; i <50; i++){
            System.out.println("myThread 안녕!!");
        }
        System.out.println("myThread 종료");
    }
}
class CaramiThread extends Thread{ //상속.. thread를 상속받은 Mythread는 thread이다.

    @Override
    public void run() {
        System.out.println("CaramiThread 출발");
        //실제 쓰레드가 해야하는 일
        for (int i =0 ; i <50; i++){
            System.out.println("CaramiThread 안녕!!");
        }
        System.out.println("CaramiThread 종료");
    }
}
public class ThreadExam {
    //멀티스레드는 수행 흐름자체를 여러가닥으로 만드는 애
    // 비동기는 작업이 완료되는것을 기다리지 않고 자체적으로 시행하는것
    public static void main(String[] args) {
        System.out.println("main 출발!!");
        MyThread myThread = new MyThread();
        myThread.start(); //약속

        CaramiThread caramiThread = new CaramiThread();
        caramiThread.start();

        for (int i =0; i<50;i++){
            System.out.println("main 안녕!");
        }
        System.out.println("main 종료");
    }
}

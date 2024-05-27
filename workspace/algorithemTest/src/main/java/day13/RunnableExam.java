package day13;

class MyRunnable implements Runnable{  //MyRunnable 은 Thread는 아니다. (단순히 implements한거기 때문에)

    @Override
    public void run() {
        System.out.println("MyRunnable 출발");
        //실제 쓰레드가 해야하는 일
        for (int i =0 ; i <50; i++){
            System.out.println("MyRunnable 안녕!!");
        }
        System.out.println("MyRunnable 종료");
    }
}

class CaramiRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("CaramiRunnable 출발");
        //실제 쓰레드가 해야하는 일
        for (int i =0 ; i <50; i++){
            System.out.println("CaramiRunnable 안녕!!");
        }
        System.out.println("CaramiRunnable 종료");
    }
}

public class RunnableExam {
    public static void main(String[] args) {
        System.out.println("main 출발");
        Thread myThread = new Thread(new MyRunnable()); //MyRunnable 자체가 쓰레드는 아니고 thread를 구현한 인터페이스를 받은 클래스일뿐.
        myThread.start();

        Thread caramiThread = new Thread(new CaramiRunnable());
        caramiThread.start();

        for (int i =0; i<50;i++){
            System.out.println("main 안녕!");
        }
        System.out.println("main 종료");
    }
}

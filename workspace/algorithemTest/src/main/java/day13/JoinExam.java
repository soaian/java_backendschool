package day13;

class DemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("배경음악 재생중!!!");
            try {
                sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}
public class JoinExam {
    static class TaskThread extends Thread{
        private String taksName;

        public TaskThread(String taksName) {
            this.taksName = taksName;
        }

        @Override
        public void run() {
            System.out.println(taksName + "작업 시작");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(taksName + "작업 완료");
        }
    }

    public static void main(String[] args) {
        TaskThread task1 = new TaskThread("작업 1");
        TaskThread task2 = new TaskThread("작업 2");


        DemonThread demonThread = new DemonThread();

        task1.start();
        task2.start();

        demonThread.setDaemon(true); //시작 전 setDemon을 이용해야한다.
        demonThread.start(); //계속 반복되기 때문에 이걸 작업이 종료되면 멈추게끔 하기위해

        try {
            System.out.println("모든 작업의 완료를 기다립니다.");
            task1.join();
            task2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("모든 작업이 완료되었습니다.");
    }
}

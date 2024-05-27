package day13.problem;

public class IncrementCounter implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=100;i++){
            System.out.println("Increment: " + i);
        }
    }
}

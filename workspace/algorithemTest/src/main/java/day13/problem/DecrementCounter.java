package day13.problem;

public class DecrementCounter implements Runnable{
    @Override
    public void run() {
        for (int i =100; i>0 ; i--){
            System.out.println("Decrement: "+i);
        }
    }
}

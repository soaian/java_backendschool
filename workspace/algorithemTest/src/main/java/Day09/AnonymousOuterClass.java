package Day09;

public class AnonymousOuterClass {
    private int outerField = 10;
    public void outerMethod(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("outerField : " + outerField);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void main(String[] args) {
        AnonymousOuterClass outerClass = new AnonymousOuterClass();
       outerClass.outerMethod();
    }
}

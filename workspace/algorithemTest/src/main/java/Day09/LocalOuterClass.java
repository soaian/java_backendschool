package Day09;

public class LocalOuterClass {
    private int outerField = 10;
    public void outerMethod(){
        class InnerClass{
            public void innerMethod() {
            System.out.println("outerField : " + outerField);
            }
        }

        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }
}

package Day09;

public class StaticOuterClass {
    private static int outerField = 10;

    private OuterClass.InnerClass innerClass;
    public static void outerMethod(){
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    static class InnerClass{
        public void innerMethod(){
            System.out.println("outerField = " + outerField);
        }
    }

    public static void main(String[] args) {
        StaticOuterClass.outerMethod();
        StaticOuterClass.InnerClass inner = new StaticOuterClass.InnerClass();
        inner.innerMethod();
    }
}

package day16;

class MyFunctionalInterfaceImpl implements MyFunctionalInterface{

    @Override
    public void method1() {
        System.out.println("첫번째 방법. 첫번째 메서드");
    }

//    @Override
//    public void method2() {
//        System.out.println("두번째 메서드");
//    }
}
public class MyFunctionalInterfaceTest {
    public static void main(String[] args) {
    MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
        @Override
        public void method1() {
            System.out.println("두번째 방법. 첫번째 메서드");
        }

//        @Override
//        public void method2() {
//            System.out.println("두번째 방법. 두번째 메서드");
//        }
    };
    MyFunctionalInterfaceImpl myFunctionalInterfaceimp = new MyFunctionalInterfaceImpl();
    myFunctionalInterfaceimp.method1();
    myFunctionalInterface.method1();

    //람다식 함수. 다만 무조건 한개의 메서드만 가져야함
    myFunctionalInterface = ()-> System.out.println("세번째 방법.첫번째 메서드");
    myFunctionalInterface.method1();

    }
}

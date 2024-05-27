package day13;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot();
        RobotPlayer playerA = new RobotPlayer("A", robot);
        RobotPlayer playerB = new RobotPlayer("B", robot);
        RobotPlayer playerC = new RobotPlayer("C", robot);

        playerA.start();
        playerB.start();
        playerC.start();
        //playerA.start(); Thread 객체 하나를 2번 start()할 수 없다.


//        method A : 1
//        method B :1
//        method C : 1
//        method B :2
//        method A : 2
//        method C : 2
//        method C : 3
//        method A : 3
//        method B :3
//        method C : 4
//        method A : 4
//        method B :4
//        method A : 5
//        method B :5
//        method C : 5

    }
}

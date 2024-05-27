package day10.baby05;

public class Tv implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("TV전원이 켜집니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV전원이 꺼집니다");
    }
}

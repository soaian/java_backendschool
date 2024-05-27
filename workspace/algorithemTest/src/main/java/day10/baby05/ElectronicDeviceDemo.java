package day10.baby05;

import java.util.ArrayList;
import java.util.List;

public class ElectronicDeviceDemo {
    public static void main(String[] args) {
        ElectronicDevice tv = new Tv();
        tv.turnOff();
        tv.turnOn();

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
    }
}

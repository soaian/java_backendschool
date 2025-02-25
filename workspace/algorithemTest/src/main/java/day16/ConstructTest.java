package day16;

import java.util.function.BiFunction;
import java.util.function.Function;

class Car{
    String name;
    String speed;

    public  Car(){

    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return name + "," + speed;
    }
}
public class ConstructTest {
    public static void main(String[] args) {
        //하나 입력받으면 하나를 리턴하는것
        Function<String, Car> func = name -> new Car(name);
        Car car = func.apply("tico");
        System.out.println(car.name);

        Function<String, Car> func2 = Car :: new;
        Car car2 = func2.apply("그랜져");
        System.out.println(car2.name);

        BiFunction<String,String,Car> func3 = Car::new;
        Car car3 = func3.apply("모닝","100");
        System.out.println(car3);
    }
}

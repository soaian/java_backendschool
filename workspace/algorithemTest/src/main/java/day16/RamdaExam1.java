package day16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerTest implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
public class RamdaExam1 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");

        Consumer<String> ramdaTest = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        items.forEach(ramdaTest);

        System.out.println("=====이렇게 표현도 가능 =====");
        items.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("========람다 표기법===========");
        //위를 밑과 같이 표현할 수 있다. 그게 람다 표기법
        items.forEach(item -> System.out.println(item));


        System.out.println("=========Thread========");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread start!!");
            }
        }).start();

        System.out.println("================람다 표기법====================");

        new Thread(() -> System.out.println("Thread start!!")).start();

        System.out.println("=========Thread2============================");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    System.out.println("Thread: " + i);
                }
            }
        }).start();

        System.out.println("================람다 표기법====================");
        new Thread(() ->{for(int i=0;i<5;i++){
            System.out.println("Thread : " + i);
        }}).start();
    }
}

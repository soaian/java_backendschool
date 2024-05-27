package day10.baby05;

public abstract class Animal {
    protected String name;
    public Animal(String name) { // 패키지가 달라도 Animal을 상속받으면 쓸수 있음
        this.name = name;
    }
    public abstract void makeSound();

}

 class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }
}


class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}
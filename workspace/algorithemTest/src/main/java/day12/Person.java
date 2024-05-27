package day12;

import java.io.Serializable;

public class Person implements Serializable { //객체를 저장하기 위해서는 객체 직렬화 과정이 필요. Serializable 은 직렬화가 된다는 표식과 같음. 아무런 기능은 없지만 무조건 필요
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

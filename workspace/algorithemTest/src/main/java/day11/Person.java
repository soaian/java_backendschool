package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>{
    private String name;
    private int age;


    @Override
    public String toString() {
        return name + ";" + age;
    }

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public int compareTo(Person o) {
//        return this.age - o.age; //나이를 기준으로 오름차순으로 정렬
//        return o.age - this.age; 나이를 기준으로 내림차순으로 정렬
//         return this.name.compareTo(o.name); //이름을 기준으로 abc순으로 정렬
        return o.name.compareTo(this.name); //이름을 기준으로 abc의 역순으로 정렬
    }


    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("kang",30));
        list.add(new Person("lee",20));
        list.add(new Person("hong",43));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Person>() { //익명객체->이때한번 사용되고 말거라면
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age- o2.age;
            }
        });
    }


}

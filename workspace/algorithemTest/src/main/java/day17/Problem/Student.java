package day17.Problem;

public class Student {
    private String name;
    private int score;

    private int age;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    public int getAge() {
        return age;
    }
}

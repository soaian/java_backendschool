package day12.problem;

import java.io.Serializable;

public class Phone implements Serializable {
    String name;
    String number;

    public Phone(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }
}

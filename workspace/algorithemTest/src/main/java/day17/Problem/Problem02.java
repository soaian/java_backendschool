package day17.Problem;
//실습 문제 3: 학생 성적 처리
//학생 객체의 리스트가 주어졌을 때, 성적(score)이 80점 이상인 학생들만을 선택하고, 이들의 이름을 알파벳 순으로 정렬하여 출력하시오.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem02 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 82),
                new Student("Bob", 90),
                new Student("Charlie", 72),
                new Student("David", 76)
        );
        List<String> name = students.stream().filter(a->a.getScore()>=80).map(Student::getName).sorted().collect(Collectors.toList());
        System.out.println(name);
    }
}

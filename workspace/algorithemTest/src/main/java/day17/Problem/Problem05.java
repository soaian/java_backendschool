package day17.Problem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//실습 문제 6: 나이대별 평균 점수 계산
//학생 리스트에서 나이대별(10대, 20대 등)로 평균 점수를 계산하시오.
public class Problem05 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 14, 88),
                new Student("Bob", 23, 82),
                new Student("Charlie", 17, 95),
                new Student("David", 21, 73)
        );
        double aver1 =  students.stream().filter(s->s.getAge()>=10 && s.getAge()<20).mapToInt(s->s.getScore()).average().orElse(0);
        double aver2 =  students.stream().filter(s->s.getAge()>=20 && s.getAge()<30).mapToInt(s->s.getScore()).average().orElse(0);

        System.out.println("10s: " + aver1);
        System.out.println("20s: " + aver2);


        System.out.println("========강사님===========");

        Map<Integer, Double> averageScoresByAgeGroup = students.stream()
                .collect(Collectors.groupingBy(
                        student -> (student.getAge() / 10) * 10,
                        Collectors.averagingInt(Student::getScore)
                ));

        averageScoresByAgeGroup.forEach((ageGroup, avgScore) ->
                System.out.println(ageGroup + "s: " + avgScore)
        );
    }
}

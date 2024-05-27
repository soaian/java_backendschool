package day17.Problem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//실습 문제 7: 도시별 최고 온도 기록
//여러 도시의 일일 최고 온도가 주어졌을 때, 각 도시의 최고 온도를 찾으시오.
public class Problem06 {
    public static void main(String[] args) {
        List<Temperature> temperatures = Arrays.asList(
                new Temperature("Seoul", 33),
                new Temperature("New York", 30),
                new Temperature("Seoul", 34),
                new Temperature("New York", 28)
        );
        Map<String,List<Temperature>> cityMap = temperatures.stream().collect(Collectors.groupingBy(Temperature::getCity));
        int tempAver1 = cityMap.get("Seoul").stream().mapToInt(s->s.getMaxTemp()).max().orElse(0);
        int tempAver2 = cityMap.get("New York").stream().mapToInt(s->s.getMaxTemp()).max().orElse(0);
        System.out.println("Seoul: " + tempAver1);
        System.out.println("New York: " + tempAver2);

        System.out.println("==============강사님============================");
        Map<String, Integer> highestTemperatures = temperatures.stream()
                .collect(Collectors.toMap(
                        Temperature::getCity,
                        Temperature::getMaxTemp,
                        Integer::max
                ));

        highestTemperatures.forEach((city, maxTemp) ->
                System.out.println(city + ": " + maxTemp)
        );
    }
}

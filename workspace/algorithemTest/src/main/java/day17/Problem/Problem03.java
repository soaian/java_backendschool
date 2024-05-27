package day17.Problem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//실습 문제 4: 직원 관리
//직원 객체의 리스트에서 각 부서(department)별로 평균 급여를 계산하시오.
public class Problem03 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "HR", 2000),
                new Employee("Charlie", "Engineering", 5000),
                new Employee("David", "Engineering", 4000)
        );
        // 부서별로 그룹핑
        Map<String, List<Employee>> groupingByDepart = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        // 급여 평균
        double hrAver= (int) groupingByDepart.get("HR").stream().mapToInt(s-> (int) s.getSalary()).average().orElse(0);
        System.out.println("HR: " + hrAver);
        double engineerAver = (int) groupingByDepart.get("Engineering").stream().mapToInt(s->(int)s.getSalary()).average().orElse(0);
        System.out.println("Engineering: " + engineerAver);

        //강사님
        System.out.println("==========================");
        Map<String, Double> averageSalaries = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        averageSalaries.forEach((department, avgSalary) ->
                System.out.println(department + ": " + avgSalary)
        );
    }
}

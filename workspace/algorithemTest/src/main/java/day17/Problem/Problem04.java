package day17.Problem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//실습 문제 5: 제품 카테고리별 평균 가격 계산
//주어진 제품 리스트에서 각 카테고리별로 평균 가격을 계산하시오.
public class Problem04 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.00),
                new Product("Smartphone", "Electronics", 700.00),
                new Product("Desk", "Furniture", 300.00),
                new Product("Chair", "Furniture", 150.00)
        );
        Map<String, List<Product>> mapByCategory = products.stream().collect(Collectors.groupingBy(Product::getCategory));
        double elecAver= mapByCategory.get("Electronics").stream().mapToInt(s-> (int) s.getPrice()).average().orElse(0);
        double furnitureAver= mapByCategory.get("Furniture").stream().mapToInt(s-> (int) s.getPrice()).average().orElse(0);
        System.out.println("Electronics: " + elecAver);
        System.out.println("Furniture: " + furnitureAver);

        System.out.println("===============강사님 스타일=============");
        Map<String, Double> averagePrices = products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)));
        averagePrices.forEach((a,b)-> System.out.println(a + ": " + b));
    }
}

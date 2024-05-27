package day11.problem;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PopulationManager {
    Map<String,Integer> population = new HashMap<>();


    private void displayAll() {
        Set<String> pKey = population.keySet();
        for (String str : pKey){
            System.out.println("도시 : " + str + ", 인구수 : " + population.get(str));
        }
    }

    private void displayPopulation(String city) {
        System.out.println("조회하고자 하는 도시 : " + city + ", " + "인구수 : " + population.get(city));
    }

    private void removeCity(String city) {
        population.remove(city);
        System.out.println(city + "삭제가 완료되었습니다");
    }

    private void addOrUpdateCity(String city, int i) {
        population.put(city,i);
        System.out.println(city +", " +i +" 추가되었습니다.");

    }

    public static void main(String[] args) {
        PopulationManager manager = new PopulationManager();
        Scanner scanner = new Scanner(System.in);

        manager.addOrUpdateCity("서울", 10000000);
        manager.addOrUpdateCity("부산", 3500000);

        while (true) {
            System.out.println("명령을 입력하세요 (1: 추가/수정, 2: 삭제, 3: 조회, 4: 전체 조회, 5: 종료): ");
            int command = scanner.nextInt(); // 사용자가 명령을 숫자로 입력
            if (command == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String city;
            switch (command) {
                case 1:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    System.out.print("인구를 입력하세요: ");
                    int population = scanner.nextInt();
                    manager.addOrUpdateCity(city, population);
                    break;
                case 2:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.removeCity(city);
                    break;
                case 3:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.displayPopulation(city);
                    break;
                case 4:
                    manager.displayAll();
                    break;
                default:
                    System.out.println("알 수 없는 명령입니다.");
            }
        }
        scanner.close();    }

}
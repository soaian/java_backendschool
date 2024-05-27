package day11;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class EmployManagerDemo {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee("홍길동", "E01", "HR"));
        manager.addEmployee(new Employee("김철수", "E02", "Marketing"));
        manager.addEmployee(new Employee("홍길동", "E01", "HR")); // 중복 추가 시도


        manager.findEmployee("E01");
        manager.removeEmployee(new Employee("홍길동", "E01", "HR"));
        manager.findEmployee("E01");
    }
}

class Employee {
    String name;
    String id;
    String department;

    public Employee(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString(){
        return "Employee {" +
                "name = " + name +" " +
                "id = " + id +" " +
                "department = " +department +
                "}";
    }
}

class EmployeeManager {
    private Set<Employee> employees = new HashSet<>();

    public void addEmployee(Employee employee) {
       if (employees.add(employee)){
           System.out.println("사원 추가 성공: " + employee);
       }else {
           System.out.println("이미 존재하는 사원입니다 : " +employee);
       }
    }
    public void findEmployee(String id) {
        for (Employee emp : employees) {
            if (emp.getId().equals(id)) {
                System.out.println("사원 검색 : " + emp);
            }
        }
    }

    public void removeEmployee(Employee employee) {
        if (employees.remove(employee)){
            System.out.println("사원정보 삭제 성공 : " + employee);
        }else {
            System.out.println("존재하지 않는 사원입니다 : " + employee);
        }
    }
}

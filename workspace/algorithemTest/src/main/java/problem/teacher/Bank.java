package problem.teacher;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Customer> customers = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

    Bank(){
        customers.add(new Customer());
    }
}

package org.example.jdbc03;


import org.example.jdbc03.dao.User;
import org.example.jdbc03.dao.UserDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
@SpringBootApplication
public class SpringJDBC03Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBC03Application.class,args);
    }

    @Bean
    public CommandLineRunner demo(UserDao userDao){
        return args -> {
            //입력 테스트
//            userDao.insertUser(new User(null,"Hong","hong@exam.com"));
            //조회 테스트
//            userDao.findAllUsers();
            //삭제 테스트
            userDao.deleteUser("hell");
            //수정 테스트
//            userDao.updateUserEmail("lee","lee@gg");
            List<User> users = userDao.findAllUsers();
            for(User user : users){
                System.out.println(user.getName() +" , "+user.getEmail());
            }
        };
    }
}

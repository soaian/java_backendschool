package org.example.jdbc02;

import org.example.jdbc02.dao.User;
import org.example.jdbc02.dao.UserDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJDBC02Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBC02Application.class,args);
    }

    @Bean
    public CommandLineRunner demo(UserDao userDao){
        return args -> {
                //입력 테스트
//            userDao.insertUser(new User(null,"Hong","hong@exam.com"));
                //조회 테스트
//            userDao.findAllUsers();
                //삭제 테스트
//            userDao.deleteUser("carami");
                //수정 테스트
             userDao.updateUserEmail("hong","hongnew@exami.com");
        };
    }
}

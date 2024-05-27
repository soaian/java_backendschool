package org.example.springjdbc08;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springjdbc08Application {
    public static void main(String[] args) {
        SpringApplication.run(Springjdbc08Application.class,args);
    }

    @Bean
    public CommandLineRunner run(UserDao userDao){
        return args -> {
            User user = new User();
            user.setName("hihihi");
            user.setEmail("hihihi@exam.com");

            User resultUser = userDao.insertUser(user);
            System.out.println(user.getId());
        };
    }
}

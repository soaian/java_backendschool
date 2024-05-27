package org.example.springdatajdbc01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }

//    @Bean
//    public CommandLineRunner demo(UserRepository userRepository){
//        return args -> {
////          userRepository.save(new User("kim","kim@exam.conm"));
////          User user = userRepository.findById(8L).get();
////            System.out.println(user.getName());
////
////            System.out.println(userRepository.findByName("maym1"));
//
//            // kang이 여러명일때
//            List<User> users = userRepository.findByName("kang");
//            users.forEach(System.out::println);
//            PageRequest pageRequest = PageRequest.of(1,2);
//            Page<User> allUser = userRepository.findAllUserWithPageination(pageRequest);
//            allUser.forEach(
//                    user -> System.out.println("User : " + user.getName() + ", Email : " + user.getEmail())
//            );
//
//        };
//    }

    @Bean
    public CommandLineRunner batchUpdateDemo(JdbcTemplate jdbcTemplate){
        return args -> {
            List<User> users = Arrays.asList(
                    new User(null, "Alice", "alice@example.com"),
                    new User(null, "Bob", "bob@example.com"),
                    new User(null, "Charlie", "charlie@example.com"),
                    new User(null, "David", "david@example.com")
            );
            String sql = "INSERT INTO users (name, email) VALUES (?,?)";

            int[] updateCounts = jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps, int i) throws SQLException {
                    User user = users.get(i);
                    ps.setString(1,user.getName());
                    ps.setString(2,user.getEmail());
                }

                @Override
                public int getBatchSize() {
                    return users.size();
                }
            });
            System.out.println("배치 업데이트 목록 : " + Arrays.toString(updateCounts));
        };
    }
}

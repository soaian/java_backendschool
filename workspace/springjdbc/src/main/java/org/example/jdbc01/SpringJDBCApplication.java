package org.example.jdbc01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.util.List;

@SpringBootApplication
public class SpringJDBCApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBCApplication.class, args);
    }

    // return ->{}; 약속. 자동으로 jdbc가 실행함
    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate){
        return args -> {
          // user 입력
//            String sql = "INSERT INTO users(name,email) VALUES (?,?)";
//            jdbcTemplate.update(sql,"carami","kang@exam.com");

            //Read 조회
            //RowMapper 를 이용해야하는 이유는 결과값 담을때.. 테이블의 칼럼과, user class의 필드를 직접 매칭 해주는 것.
            //테이블의 컬럼과, 클래스의 필드가 완전히 일치하다면??

//            List<User> users = jdbcTemplate.query("SELECT id,name,email FROM users", new BeanPropertyRowMapper<>(User.class)); //BeanPropertyRowMapper -> 알아서 적절한 값을 넣어줌 (컬럼명이 완벽히 일치하지 않을때 많이씀)
//            for (User user : users){
//                System.out.println(user);
//            }
            //위의 코드보단 밑의 코드로 쓰는게 더 깔끔
//            users.forEach(System.out::println);
//            System.out.println("===========");
//            //삭제하기
//            String delete = "DELETE FROM users where id = ?";
//            jdbcTemplate.update(delete,1);

            RowMapper<User> rowMapper = (ResultSet rs, int rowNum) -> new User(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getString("email")
            );
            List<User> users1 = jdbcTemplate.query("SELECT id, name, email FROM users",rowMapper);
//            users1.forEach(System.out::println);
            users1.forEach(user -> System.out.println(user));

        };
    }
}
